package br.com.orange.API.form;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.orange.API.model.Address;
import br.com.orange.API.model.User;

public class UserForm {

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String mail;

    @NotNull
    @NotEmpty
    private String CPF;

    @NotEmpty
    @NotNull
    @JsonFormat(pattern = "dd-MM-yyyy")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDate birthDate;


    @NotEmpty
    @NotNull
    private List<AddressForm> adresses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<AddressForm> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<AddressForm> adresses) {
        this.adresses = adresses;
    }

    public List<Address> convertAddresses(List<AddressForm> addresses) {
        List<Address> adr = new ArrayList<>();
        if (addresses != null) {
            addresses.forEach(add -> {
                Address address = new Address(add.getStreet(), add.getNumero(), add.getComplement(), add.getCEP());
                adr.add(address);
            });
            return adr;
        } else {
            return null;
        }


    }

    public User convert() {
        List<Address> addressesList = convertAddresses(this.adresses);
        if (addressesList == null) {
            addressesList.add(new Address());
        }
        User user = new User(addressesList, this.mail, this.CPF, this.name, this.birthDate);
        addressesList.forEach(address -> {
            address.setUser(user);
        });
        return user;
    }

}
