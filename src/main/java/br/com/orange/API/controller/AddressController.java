package br.com.orange.API.controller;


import br.com.orange.API.dto.AddressDetailsDto;
import br.com.orange.API.form.AddressForm;
import br.com.orange.API.model.Address;
import br.com.orange.API.model.User;
import br.com.orange.API.repository.AddressRepository;
import br.com.orange.API.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private UserRepository userRepository;

    /* To Implement a Address, you must provide the User Id*/
    @PostMapping("/{id}")
    @Transactional
    public ResponseEntity<?> newAddress(@RequestBody @Valid AddressForm form, @PathVariable("id") long id) {
        User user = userRepository.getOne(id);
        Address add = new Address(form.getStreet(), form.getNumero(),
                form.getComplement(), form.getCEP());
        add.setUser(user);
        addressRepository.save(add);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public List<AddressDetailsDto> getAddressDetails(@PathVariable("id") long id) {
        User user = userRepository.getOne(id);
        List<Address> add = addressRepository.findAllByUser(user);
        return AddressDetailsDto.convert(add);
    }


}

