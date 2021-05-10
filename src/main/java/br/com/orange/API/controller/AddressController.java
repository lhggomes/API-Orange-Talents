package br.com.orange.API.controller;


import br.com.orange.API.form.AddressForm;
import br.com.orange.API.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;


    @PostMapping("/{id}")
    @Transactional
    public ResponseEntity<?> newAddress(@RequestBody @Valid AddressForm form, @PathVariable("id") long id){

        return null;
    }

}
