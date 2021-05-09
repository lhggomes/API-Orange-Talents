package br.com.orange.API.controller.form;

import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import br.com.orange.API.model.Address;

public class AddressForm {
	
	@NotNull
	@NotEmpty
	private String street;
	
	@NotNull
	@NotEmpty
	private Integer numero;
	
	@NotEmpty
	@NotNull
	private String complement;
	
	@NotNull
	@NotEmpty
	private String CEP;
	
	
	
	public AddressForm(String street, Integer numero, String complement, String cEP) {
		this.street = street;
		this.numero = numero;
		this.complement = complement;
		this.CEP = cEP;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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

	public void setCEP(String cEP) {
		CEP = cEP;
	}
	
	public static List<Address> convert(List<AddressForm> adresses) {
		
		
		adresses.forEach(add -> {
			Address address = new Address();
		});
		Address a = new Address();
		return Arrays.asList(a);
	}

}
