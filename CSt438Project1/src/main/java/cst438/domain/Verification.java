package cst438.domain;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Verification

{
   @Id
   @GeneratedValue
	@NotNull
	@Size(min=3, max=25)
   private String username;
   
	@NotNull
	@Size(min=3, max=25)
   private String password;
   
   public Verification()
   {

   }

   public Verification(String username, String password)
   {
      super();
      this.username = username;
      this.password = password;
      
   }


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
