package net.jajicaiot.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import net.jajicaiot.app.entity.Device;
import net.jajicaiot.app.entity.User;

public interface DeviceService {
	
	public Iterable<Device> findAll1();
	
	public Page<Device> findAll(Pageable pageable);

	
	public Optional<Device> findById(Long id);
	
	public User save(Device device);
	
	public void deleteById(Device id);

	public Optional<User> findById(Device id);
	
}
