package br.com.orange.API.repository;

import br.com.orange.API.model.Address;
import br.com.orange.API.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> findAllByUser(User user);

}
