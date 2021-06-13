package cst438.services;

import java.awt.PageAttributes.MediaType;
import java.net.http.HttpHeaders;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewService
{
   private RestTemplate restTemplate;

   public NewService()
   {
      restTemplate = new RestTemplate();

   }

   @SuppressWarnings("rawtypes")
   public Map getSomeCars()
   {

      HttpHeaders header = new HttpHeaders();
      header.setContentType(MediaType.APPLICATION_JSON);
      HttpEntity<String> requestEntity = new HttpEntity<String>(header);
      ResponseEntity<Map> entity = restTemplate.
         exchange("https://api.nytimes.com/svc/topstories/v2/arts.json?api-key=",
            HttpMethod.GET, requestEntity, Map.class);


      if(entity.getStatusCode() == HttpStatus.OK)
      {
         return entity.getBody();
      }

      return null;

   }

}
