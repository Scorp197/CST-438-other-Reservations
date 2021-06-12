package cst438.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {

   @Id
   @GeneratedValue
   private long id;

   //@NotNull
   @Size(min=3, max=25)
   private String Username;

   //@NotNull
   @Size(min=3, max=25)
   private String Password;


   //@NotNull
   @Size(min=3, max=25)
   private String firstName;

   //@NotNull
   @Size(min=3, max=25)
   private String lastName;





   //  @NotNull
   //  @Size(min=3, max=25)
   //  private String originCity;
   //

   private String date;


   public User() {

   }

   public User(@NotNull int id, String Username, String Password, String originCity, String destination, String departureDate, String returnDate) {
      super();
      this.id = id;
      this.Username = Username;
      this.Password = Password;
      this.firstName = firstName;
      this.lastName = lastName;
      //      this.originCity = originCity;

   }


   //  public String getOriginCity() {
   //      return originCity;
   //  }
   //
   //  public void setOriginCity(String originCity) {
   //      this.originCity = originCity;
   //  }

   public String getDate() {
      return date;
   }

   public String getFirstName() {
      return firstName;
   }

   public long getId() { return id; }

   public String getLastName() {
      return lastName;
   }

   public String getPassword() {
      return Password;
   }
   public String getUsername() {
      return Username;
   }

   public void setDate(String date) {
      this.date = date;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public void setId(long id) { this.id = id;}

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public void setPassword(String Password) {
      this.Password = Password;
   }

   public void setUsername(String Username) {
      this.Username = Username;
   }



}