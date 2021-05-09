package br.com.orange.API.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Address> adresses;
    
    @Column(unique = true)
    private String mail;

    @Column(unique = true)
    private String cpf;

    private String name;
    private LocalDate birthDate;

    
    
	public User() {
	}
	
	

	public User(List<Address> adresses, String mail, String cpf, String name, LocalDate birthDate) {
		super();
		this.adresses = adresses;
		this.mail = mail;
		this.cpf = cpf;
		this.name = name;
		this.birthDate = birthDate;
	}



	public String getEmail() {
        return mail;
    }

    public void setEmail(String email) {
        this.mail = email;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
