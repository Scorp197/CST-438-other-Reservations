package cst438.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cst438.domain.CityRepository;


@Service
public class CityService {

   @Autowired
   CityRepository cityRepository;


   //  @Autowired
   //  private FanoutExchange fanout;


   public void requestReservation(
      String cityName,
      String level,
      String email) {

      String msg = "{\"cityName\": \"" + cityName +
         "\" \"level\": \""+level+
         "\" \"email\": \""+email+"\"}" ;
      System.out.println("Sending message:"+msg);
      //          rabbitTemplate.convertSendAndReceive(
      //          fanout.getName(),"", // routing key none.
      //          msg);

   }

}