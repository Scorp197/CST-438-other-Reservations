package cst438.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Verification, Long> {
	
	@Query("select v from Verification v order by username, password")
	List<Verification> findAllOrderByVerificationDesc();
}