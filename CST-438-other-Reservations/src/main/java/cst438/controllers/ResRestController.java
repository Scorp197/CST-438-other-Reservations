package cst438.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
   @GetMapping(value = "/getCarByCity/{city}", produces = "application/json")
   public ResponseEntity<CarFind> getCarByCity(@PathVariable("city") String city)
   {
      logger.info("Car Service Get Mapping city: {}", city);
      // look up car information from the car service database.
      // There may be multiple cars returned for the specified city.
      List<CarFind> cars = packageService.getCar(city);
      if ( cars.size()==0)
      {

         // cars not found.  Send 404 return code.
         return new ResponseEntity<CarFind>( HttpStatus.NOT_FOUND);

      }

      else

      {
         CarFind car = cars.get(0); // Only select the first car in list

         // return 200 status code (OK) and car information in JSON format
         return new ResponseEntity<CarFind>(car, HttpStatus.OK);

      }
   }

   // http://localhost:8080/api/getFlightByCity/seattle/boston
   @GetMapping(value = "/getFlightByCity/{originCity}/{destination}", produces = "application/json")
   public ResponseEntity<FlightFind> getFlightByCity(@PathVariable String originCity, @PathVariable String destination)
   {

      logger.info("Airline Service Get Mapping originCity: {} and destination: {}", originCity, destination);
      // look up flight information from the airline service database.
      // There may be multiple airlines returned for the specified city.
      List<FlightFind> flights = packageService.getFlight(originCity, destination);
      if ( flights.size()==0)
      {

         // flights not found.  Send 404 return code.
         return new ResponseEntity<FlightFind>( HttpStatus.NOT_FOUND);

      }

      else

      {
         FlightFind flight = flights.get(0); // Only select the first flight in list

         // return 200 status code (OK) and flight information in JSON format
         return new ResponseEntity<FlightFind>(flight, HttpStatus.OK);

      }

   }

   // http://localhost:8080/api/getHotelByCity/seattle
   @GetMapping(value = "/getHotelByCity/{city}")
   public HotelFind getHotelByCity(@PathVariable String city)
   {

      logger.info("Hotel Service Get Mapping city: {}", city);
      return new HotelFind();

   }

}