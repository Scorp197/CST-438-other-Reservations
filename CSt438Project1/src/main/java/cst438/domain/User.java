package cst438.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	@Size(min=3, max=25)
	private String Username;
	
	
	@NotNull
	@Size(min=3, max=25)
	private String Password;
	
	
	private String date;
	
	
	public User() {
		
	}
	
	public User(@NotNull String Username, String Password) {
		super();
		this.id = id;
		this.Username = Username;
		this.Password = Password;
	}
	
	public long getId() { return id; }
	public void setId(long id) { this.id = id;}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String Username) {
		this.Username = Username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	} 
	
	
	
}