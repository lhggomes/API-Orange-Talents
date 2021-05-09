package br.com.orange.API.controller.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.orange.API.model.User;



public interface UserRepository extends JpaRepository<User, Long> {

}
