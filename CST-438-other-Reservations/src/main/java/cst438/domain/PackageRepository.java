package cst438.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PackageRepository extends CrudRepository<Package, Long> {

   @Query("select p from Package p order by packageId desc")
   List<Package> findAllOrderByPackageDesc();
}