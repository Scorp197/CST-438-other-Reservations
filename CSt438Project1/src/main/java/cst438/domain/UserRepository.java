package cst438.domain;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
	
	@Query("select u from User u order by username")
	List<User> findAllOrderByUsername();
}