package cst438.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import cst438.domain.CarFind;
import cst438.domain.City;
import cst438.domain.CityRepository;
import cst438.domain.Country;
import cst438.domain.FlightFind;
import cst438.domain.HotelFind;
import cst438.domain.PackageRepository;
import cst438.services.PackageService;

// class must be annotated as WebMvcTest,  not SpringBootTest
@WebMvcTest(ResRestController.class)
public class ResRestControllerTest
{

   // declare as @MockBean those classes which will be stubbed in the test
   // These classes must be Spring components (such as Repositories)
   // or @Service classes.

   @MockBean
   private PackageService packageService;

   @MockBean
   private PackageRepository packageRepository;

   @MockBean
   private CityRepository cityRepository;

   // This class is used for make simulated HTTP requests to the class
   // being tested.
   @Autowired
   private MockMvc mvc;

   // These objects will be magically initialized by the initFields method
   // below.
   private JacksonTester<City> jsonCityAttempt;

   // This method is executed before each Test.
   @SuppressWarnings("deprecation")
   @BeforeEach
   public void setUpEach()
   {
      MockitoAnnotations.initMocks(this);
      JacksonTester.initFields(this, new ObjectMapper());
   }

   // Have one or more test methods.
   @Test
   public void test1() throws Exception
   {

      Country country = new Country("TST", "Test Country");
      City city = new City(1, "TestCity", "DistrictTest", 100000, country);
      List<City> cities = new ArrayList<City>();
      cities.add(city);

      // create the stub calls and return data for airline service
      // when the getFlight method is called with the origin city and
      // destination city
      // parameters "new york" and "boston",
      // the stub will return the flight itinerary data.

      // stub test for flight Id number search
      given(packageService.getFlight("new york", "boston"))
      .willReturn(new FlightFind(3));

      // stub test for departure date search
      given(packageService.getFlight("new york", "boston"))
      .willReturn(new FlightFind("2021-08-13"));

      // create the stub calls and return data for car rental service
      // when the getCar method is called with the destination city
      // parameters "new york", the stub will return the car itinerary data.

      // stub test for car Id number search
      given(packageService.getCar("new york")).willReturn(new CarFind(1));

      // stub test for car rental date search
      given(packageService.getCar("new york"))
      .willReturn(new CarFind("2021-08-13"));

      // create the stub calls and return data for hotel service
      // when the getFlight method is called with destination city
      // parameter "new york",
      // the stub will return the hotel itinerary data.

      // stub test for hotel Id number search
      given(packageService.getHotel("new york")).willReturn(new HotelFind(4));

      // stub test for arrival date search
      given(packageService.getHotel("new york"))
      .willReturn(new HotelFind("2021-08-13"));

      // this is the stub for the CityRepository. When given input parm of
      // "TestCity",
      // it will return a list of cities.
      given(cityRepository.findByName("TestCity")).willReturn(cities);

      // perform the test by making simulated HTTP get using URL of
      // "/city/TestCity"
      MockHttpServletResponse response = mvc.perform(get("/city/TestCity"))
         .andReturn().getResponse();

      // verify that result is as expected
      assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());

      // // convert returned data from JSON string format to flight object
      // FlightFind flightResult =
      // jsonFlightAttempt.parseObject(response.getContentAsString());
      //
      // FlightFind expectedResult = new FlightFind(3, "united", "2021-08-13",
      // "17:23:00", 1, "new york", "boston", 150);
      // // expected departureTime is 17:23:00
      // expectedResult.set(new FlightFind(3, "united", "2021-08-13",
      // "17:23:00", 1, "new york", "boston", 150));
      //
      // // compare actual return data with expected data
      // // MUST implement .equals( ) method.
      // assertThat(flightResult).isEqualTo(expectedResult);

   }

}
