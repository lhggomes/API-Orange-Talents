package br.com.orange.API.controller.form;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.orange.API.controller.repository.UserRepository;
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
	private LocalDate birthDate;
	
	@NotEmpty
	@NotNull
	private List<AddressForm> adresses;

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
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

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public User convert(UserRepository userRepository) {
		List<Address> adressesList = AddressForm.convert(this.adresses);
		User user = new User(adressesList, this.mail, this.CPF, this.name, this.birthDate);
		return user;
	}

}
