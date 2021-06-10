//package cst438.services;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import cst438.domain.Package;
//import cst438.domain.PackageRepository;
//
//@SpringBootTest
//public class PackageServiceTest
//{
//
//   @Autowired
//   PackageRepository packageRepository;
//
//
//   @Test
//   public void test1()
//   {
//      Package p;
//
//      // delete any database data
//      packageRepository.deleteAll();
//
//      // create test package
//
//      long packageId = 1;
//      int reserved = 1;
//      long userId = 1;
//      long airlineId = 1;
//      long hotelId = 1;
//      long carId = 1;
//      String pkgDescription = "Test Vacation Package";
//
//      p = new Package(packageId, reserved, userId, airlineId, hotelId, carId, pkgDescription);
//
//      packageRepository.save(p);
//
//      //      // now, retrieve and verify that date is returned in correct order
////            Package testPackage = PackageRepository.findById(packageId);
////            assertEquals(1 , testPackage.getCarId());
////            assertEquals(1, testPackage.getAirlineId());
////            assertEquals(1, testPackage.getHotelId());
////            assertEquals("Test Vacation Package", testPackage.getPkgDescription());
//
//   }
//}