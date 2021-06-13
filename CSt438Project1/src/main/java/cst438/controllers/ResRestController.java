package cst438.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cst438.domain.CarFind;
import cst438.domain.FlightFind;
import cst438.domain.HotelFind;
import cst438.domain.PackageRepository;
import cst438.services.PackageService;

@RestController
@RequestMapping("/api")
public class ResRestController
{
   private static final Logger logger = LoggerFactory.getLogger(ResRestController.class);

   @Autowired
   PackageRepository packageRepository;

   @Autowired
   private PackageService packageService;
   
   @GetMapping(value = "/allpackages") // List all the packages saved to the table
   public Iterable<cst438.domain.Package> getAllPackages() {
      return packageRepository.findAll();
   }
   // http://localhost:8080/api/getCarByCity/seattle
   @GetMapping(value = "/getCarByCity/{city}")
   public CarFind getCarByCity(@PathVariable String city)
   {

      logger.info("Car Service Get Mapping city: {}", city);
      return new CarFind();

   }

   // http://localhost:8080/api/getFlightByCity/seattle/boston
   @GetMapping(value = "/getFlightByCity/{originCity}/{destination}")
   public FlightFind getFlightByCity(@PathVariable String originCity, @PathVariable String destination)
   {

      logger.info("Airline Service Get Mapping originCity: {} and destination: {}", originCity, destination);
      return new FlightFind();

   }
   // http://localhost:8080/api/getHotelByCity/seattle
   @GetMapping(value = "/getHotelByCity/{city}")
   public HotelFind getHotelByCity(@PathVariable String city)
   {

      logger.info("Hotel Service Get Mapping city: {}", city);
      return new HotelFind();


   }

}
