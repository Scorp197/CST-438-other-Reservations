package cst438.controllers;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import cst438.domain.User;
import cst438.domain.UserRepository;


@Controller
public class UserController {  
	

	@Autowired
	UserRepository userRepository;

	
	@GetMapping("/users")
	public String getAllUserData(Model model) 
	{	
		Iterable<User> project1 = userRepository.findAllOrderByMovieTitleMovieRating();
		model.addAttribute("project1", project1);
		return "user_list"; 
	}

	
	  @PostMapping("/usersignup") // A new reservation from a form
	   public String UserSignupForm(@Valid User user, 
				BindingResult result, 
				Model model) {
		  model.addAttribute("user", user);
	   {
	      if (result.hasErrors())  {
				return "user_signup_form";
			}	
	      user.setDate(new java.util.Date().toString());		
			userRepository.save(user);
			return "user_signup_show";
	   }
	  }
	 
	  
	  @GetMapping("/usersignup")
		public String createUserSignupForm(Model model) 
		{
			User user = new User();
			model.addAttribute("user", user);
			return "user_signup_form";
		}
	   
	  @PostMapping("/userlogin") // A new reservation from a form
	   public String UserloginForm(@Valid User user, BindingResult result, Model model) {
				model.addAttribute("user", user); //new line added
				
				if (result.hasErrors()) {
					return "user_login_form";
				}	
				user.setDate(new java.util.Date().toString());		
				userRepository.save(user);
				return "user_login_show";
			}
	  
	  //add logic that checks if username and password is the same as the one the user signed up with
	  @GetMapping("/userlogin")
		public String createUserLoginForm(Model model) 
		{
			User user = new User();
			model.addAttribute("user", user);
			return "user_login_form";
		}
	      
	  }
