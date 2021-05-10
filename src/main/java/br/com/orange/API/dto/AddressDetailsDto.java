package br.com.orange.API.dto;

import br.com.orange.API.model.Address;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AddressDetailsDto {

    private String street;
    private Integer number;
    private String complement;
    private String CEP;

    public String getStreet() {
        return street;
    }

    public AddressDetailsDto(Address address) {
        this.street = address.getStreet();
        this.number = address.getNumber();
        this.complement = address.getComplement();
        this.CEP = address.getCEP();
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public static List<AddressDetailsDto> convert(List<Address> address){
        return address.stream().map(AddressDetailsDto::new).collect(Collectors.toList());

    }


}
