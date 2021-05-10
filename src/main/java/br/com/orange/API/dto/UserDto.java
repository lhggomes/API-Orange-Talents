package br.com.orange.API.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.com.orange.API.model.Address;
import br.com.orange.API.model.User;

public class UserDto {

	private Long id;
	private List<Address> adresses;
	private String mail;
	private String cpf;
	private String name;
	private LocalDate birthDate;

	public UserDto(User user) {
		setId(user.getId());
		setMail(user.getEmail());
		setName(user.getName());
		setAdresses(getAdresses());
		setBirthDate(user.getBirthDate());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Address> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Address> adresses) {
		this.adresses = adresses;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public static List<UserDto> convert(List<User> users) {
		return users.stream().map(UserDto::new).collect(Collectors.toList());
	}

}
