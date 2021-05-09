package br.com.orange.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.orange.API.controller.form.UserForm;
import br.com.orange.API.controller.repository.UserRepository;
import br.com.orange.API.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	
	
	@PostMapping
	@Transactional
	public void newUser(UserForm form, UriComponentsBuilder uriBuilder) {
		User user = form.convert(userRepository);
		
	}


}
