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
public class UserVerification {  
	

	@Autowired
	UserRepository userRepository;

	
	@GetMapping("/movies")
	public String getAllMovieRating(Model model) 
	{	
		Iterable<User> project1 = userRepository.findAllOrderByMovieTitleMovieRating();
		model.addAttribute("project1", project1);
		return "user_list"; 
	}
	
	@PostMapping("/movies/new")
	public String processMovieForm(@Valid User movie, 
			BindingResult result, 
			Model model) {
		model.addAttribute("movie", movie); //new line added
		
		if (result.hasErrors()) {
			return "movie_form";
		}	
		movie.setDate(new java.util.Date().toString());		
		userRepository.save(movie);
		return "user_show";
	}
	
	  @PostMapping("/usersignup") // A new reservation from a form
	   public String UserSignupForm(@Valid User movie, 
				BindingResult result, 
				Model model) {
		  model.addAttribute("movie", movie);
	   {
	      if (result.hasErrors())  {
				return "user_signup_form";
			}	
	      movie.setDate(new java.util.Date().toString());		
			userRepository.save(movie);
			return "user_show";
	   }
	  }
	 
	  
	  @GetMapping("/usersignup")
		public String createUserValidation(Model model) 
		{
			User movie = new User();
			model.addAttribute("movie", movie);
			return "user_signup_form";
		}
	   
	  @PostMapping("/userlogin") // A new reservation from a form
	   public String UserloginForm(@Valid User movie, BindingResult result, Model model) {
				model.addAttribute("movie", movie); //new line added
				
				if (result.hasErrors()) {
					return "user_login_form";
				}	
				movie.setDate(new java.util.Date().toString());		
				userRepository.save(movie);
				return "user_show";
			}
	  
	  //add logic that checks if username and password is the same as the one the user signed up with
	  @GetMapping("/userlogin")
		public String createUserLogin(Model model) 
		{
			User movie = new User();
			model.addAttribute("movie", movie);
			return "user_login_form";
		}
	      
	  }
