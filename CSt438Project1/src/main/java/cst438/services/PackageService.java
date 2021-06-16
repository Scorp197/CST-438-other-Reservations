package cst438.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import cst438.domain.CarFind;
import cst438.domain.FlightFind;
import cst438.domain.HotelFind;

@Service
public class PackageService {
   
   private static final Logger log = LoggerFactory.getLogger(PackageService.class);
   private static RestTemplate restTemplate;
   private static String carUrl;
   private static String airlineUrl;
   private static String hotelUrl;

   // retrieve url for PackageService from application.properties file
   public PackageService(
      @Value("${airline.url}") final String airlineUrl,
      @Value("${car.url}") final String carUrl,
      @Value("${hotel.url}") final String hotelUrl )
   {
      this.restTemplate = new RestTemplate();
      this.airlineUrl = airlineUrl;
      this.carUrl = carUrl;
      this.hotelUrl = hotelUrl;
   }

   public CarFind getCar(String carCity)
   {
      // display car for package

      ResponseEntity<JsonNode> response = restTemplate.getForEntity(
         carUrl + "/api/getCarByCity?city=" + carCity,
         JsonNode.class);

      JsonNode json = response.getBody();
      log.info("Status code from car server:" + response.getStatusCodeValue());

      int id = json.get("id").asInt();
      String make = json.get("make").asText();
      String model = json.get("model").asText();
      String fuel = json.get("fuel").asText();
      String transmission = json.get("transmission").asText();
      int year = json.get("year").asInt();
      double price = json.get("price").asDouble();
      String city = json.get("city").asText();
      return new CarFind(id, make, model, fuel,
         transmission, year, price, city);
   }

   public FlightFind getFlight(String originCity, String destinationCity)
   {
      // display flight for package

      ResponseEntity<JsonNode> response = restTemplate.getForEntity(
         airlineUrl + "/api/getFlights?originCity=" + originCity + "&destinationCity=" + destinationCity,
         JsonNode.class);

      JsonNode json = response.getBody();
      log.info("Status code from airline server:" + response.getStatusCodeValue());

      int flightId = json.get("flightId").asInt();
      String airlineName = json.get("airlineName").asText();
      String departureDate = json.get("departureDate").asText();
      String departureTime = json.get("departureTime").asText();
      int numberOfStops = json.get("numberOfStops").asInt();
      originCity = json.get("originCity").asText();
      destinationCity = json.get("destinationCity").asText();
      double price = json.get("price").asDouble();

      return new FlightFind(flightId, airlineName, departureDate,
         departureTime, numberOfStops, originCity, destinationCity, price);
   }

   public HotelFind getHotel(String hotel_City)
   {
      // display hotel for package

      ResponseEntity<JsonNode> response = restTemplate.getForEntity(
         hotelUrl + "/api/gethotels?" + hotel_City,
         JsonNode.class);

      JsonNode json = response.getBody();
      log.info("Status code from hotel server:" + response.getStatusCodeValue());

      int hotelId = json.get("hotelId").asInt();
      String hotelName = json.get("hotelName").asText();
      String arrivalDate = json.get("arrivalDate").asText();
      String departureDate = json.get("departureDate").asText();
      String hotelCity = json.get("hotelCity").asText();
      double price = json.get("price").asDouble();

      return new HotelFind(hotelId, hotelName, arrivalDate,
         departureDate, hotelCity, price);
   }
   
   public static CarFind searchCar(String carCity)
   {

      ResponseEntity<JsonNode> response = restTemplate.getForEntity(
         carUrl + "/api/getCarByCity?city=" + carCity, JsonNode.class);

      JsonNode json = response.getBody();
      log.info("Status code from car server:" + response.getStatusCodeValue());
      log.info("GETBODY" + response.getBody());

      final ObjectMapper objectMapper = new ObjectMapper();
      CarFind[] cars = null;
      try
      {
         cars = objectMapper.readValue(json.toPrettyString(), CarFind[].class);
      } catch (JsonProcessingException e)
      {
         e.printStackTrace();
      }

      List<CarFind> carList = new ArrayList<CarFind>(Arrays.asList(cars));

      carList.forEach(x -> System.out.println(x.toString()));
      return carList.get(0);
   }
   
      public static HotelFind searchHotel()
   {

      ResponseEntity<JsonNode> response = restTemplate.getForEntity(
         hotelUrl + "/api/hotels",
         JsonNode.class);

      JsonNode json = response.getBody();
      log.info("Status code from hotel server:" + response.getStatusCodeValue());
      log.info("GETBODY" + response.getBody());

      final ObjectMapper objectMapper = new ObjectMapper();
      HotelFind[] hotels = null;
      try
      {
         hotels = objectMapper.readValue(json.toPrettyString(), HotelFind[].class);
      }  catch (JsonProcessingException e)
      {
         e.printStackTrace();
      }

      List<HotelFind> hotelList = new ArrayList<HotelFind>(Arrays.asList(hotels));

      hotelList.forEach(x -> System.out.println(x.toString()));
      return hotelList.get(0);
   }
   
      public static FlightFind searchFlight(String originCity)
   {

      ResponseEntity<JsonNode> response = restTemplate.getForEntity(
         "https://cst438w3a-airline-service.herokuapp.com/api/getFlights?originCity=seattle&destinationCity=san%20diego", JsonNode.class);

      JsonNode json = response.getBody();
      log.info("Status code from airline server:" + response.getStatusCodeValue());
      log.info("GETBODY" + response.getBody());

      final ObjectMapper objectMapper = new ObjectMapper();
      FlightFind[] flights = null;
      try
      {
         flights = objectMapper.readValue(json.toPrettyString(), FlightFind[].class);
      } catch (JsonProcessingException e)
      {
         e.printStackTrace();
      }

      List<FlightFind> flightList = new ArrayList<FlightFind>(Arrays.asList(flights));

      flightList.forEach(x -> System.out.println(x.toString()));
      return flightList.get(0);
   }
}
