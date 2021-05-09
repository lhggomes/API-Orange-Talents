package br.com.orange.API.controller.repository;

import br.com.orange.API.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
