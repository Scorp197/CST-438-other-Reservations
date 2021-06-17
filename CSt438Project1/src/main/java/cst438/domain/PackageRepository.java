package cst438.domain;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PackageRepository extends CrudRepository<Package, Long> {

   @Query("select p from Package p order by packageId desc")
   List<Package> findAllOrderByPackageDesc();
   
   @Query(value = "SELECT * from Package p WHERE p.origin_city = ?1", nativeQuery = true)
   List<Package> findByoriginCity(String originCity, String destinationCity);
   
	List<Package>findAll();
}
//	List<Package> find(long packageId);

//}

