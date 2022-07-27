package net.jajicaiot.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.jajicaiot.app.entity.Device;
import net.jajicaiot.app.entity.User;

@Service
public class DeviceServiceImpl implements DeviceService{

	@Override
	public Iterable<Device> findAll1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Device> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Device> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public User save(Device device) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Device id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<User> findById(Device id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
