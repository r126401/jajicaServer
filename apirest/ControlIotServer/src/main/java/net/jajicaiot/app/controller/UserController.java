package net.jajicaiot.app.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jajicaiot.app.entity.User;
import net.jajicaiot.app.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	//Asi enlazamos el  controlador con userService
	@Autowired
	private UserService userService;
	
	//Crear un nuevo usuario.
	@PostMapping
	public ResponseEntity<?> create(@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Long id) {
		
		//Llamamos a la interfaz userService y metodo findById para hacer la consulta a base de datos
		Optional<User> oUser = userService.findById(id);
		
		if (!oUser.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oUser);
		
		
	}
	

}
