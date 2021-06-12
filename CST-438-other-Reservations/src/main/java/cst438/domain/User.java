package cst438.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {

   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private long id;

   //@NotNull
   @Size(min=3, max=40)
   public String email;

   //@NotNull
   @Size(min=3, max=25)
   private String Password;

   //   @NotNull
   @Size(min=3, max=25)
   private String firstName;

   //@NotNull
   @Size(min=3, max=25)
   private String lastName;


   private String date;

   public User() {

   }

   public User(@NotNull int id, String email, String Password, String firstName, String lastName) {
      super();
      this.id = id;
      this.email = email;
      this.Password = Password;
      this.firstName = firstName;
      this.lastName = lastName;

   }


   public String getDate() {
      return date;
   }

   public String getemail() {
      return email;
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

   public void setDate(String date) {
      this.date = date;
   }

   public void setemail(String email) {
      this.email = email;
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
}