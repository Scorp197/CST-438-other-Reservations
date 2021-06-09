package cst438;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;


import cst438.domain.User;
import cst438.domain.UserRepository;


public class UserVerificationTests {
	
	
private static final String Username2 = "batman";
private static final String Username1 = "robin";
private static final String Password2 = "Gotham";
private static final String Password1 = "Golly";

@MockBean
UserRepository userRepository;
	
//	@Test
//	public void createUserTest() {
//		User u;
//		
//	// create test user with username and password
//			u = new User("dusty", "bottoms");
//
//		}
	
	

@Test
public boolean VerifyUserLoginInfo(String Username, String Password) {
	 userRepository.findByUserLoginInfo(Username, Password);
	if (Username1 == Username2 & Password1 == Password2) {
		
		return true;
	}
		
		return false;
	
	}

@Test
public boolean VerifyUserSignupInfo(String Username, String Password) {
	userRepository.findByUserSignupInfo(Username, Password);
	if (Username1 == Username2 & Password1 == Password2) {
		
		return true;
	}
	
		return false;
	}
}


