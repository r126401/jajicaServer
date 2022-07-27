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

import net.jajicaiot.app.entity.Device;
import net.jajicaiot.app.service.DeviceService;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {

	@Autowired	
	DeviceService deviceService;
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Device device) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(deviceService.save(device));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Long id) {
		
		//Llamamos a la interfaz userService y metodo findById para hacer la consulta a base de datos
		Optional<Device> oDevice = deviceService.findById(id);
		
		if (!oDevice.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(oDevice);
		
	}
	
	
	
}
