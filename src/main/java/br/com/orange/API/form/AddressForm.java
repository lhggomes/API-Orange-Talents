package br.com.orange.API.form;

import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;


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
	
	
	
	public AddressForm(String street, Integer numero, String complement, String cep) {
		this.street = street;
		this.numero = numero;
		this.complement = complement;
		this.CEP = cep;
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

	public void setCEP(String cep) {
		CEP = cep;
	}
	

}
