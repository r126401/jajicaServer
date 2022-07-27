package net.jajicaiot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.jajicaiot.app.entity.User;

@Repository
// Como parametro damos la clase que definimos en entity y a la que hace referencia. Long porque el id es long
public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
