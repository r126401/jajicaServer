package net.jajicaiot.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import net.jajicaiot.app.entity.User;

public interface UserService {
	
	public Iterable<User> findAll1();
	
	public Page<User> findAll(Pageable pageable);
	
	public Optional<User> finById(Long id);
	
	public User save(User user);
	
	public void deleteById(Long id);

	public Optional<User> findById(Long id);
	

}
