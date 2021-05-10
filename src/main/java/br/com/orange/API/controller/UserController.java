package br.com.orange.API.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.orange.API.controller.dto.UserDto;
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
	public ResponseEntity<?> newUser(@RequestBody @Valid UserForm form, UriComponentsBuilder uriBuilder) {
		User user = form.convert();
		userRepository.save(user);
		return ResponseEntity.ok().build();
		
	}
	
	@GetMapping
	public List<UserDto> list(String userName){

		List<User> users;
		if(userName == null) {
			users = userRepository.findAll();
		} else {
			users = userRepository.findByname(userName);
		}
		return UserDto.convert(users);

	}
	
}
