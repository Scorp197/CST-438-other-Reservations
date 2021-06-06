package cst438.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cst438.domain.UserRepository;
import cst438.domain.Verification;



public class VerificationController {
	
	   @Autowired
	   UserRepository userRepository;
	
	@GetMapping("/movies")
	public String getAllVerification(Model model) 
	{	
		Iterable<Verification> movies = userRepository.findAllOrderByVerificationDesc();
		model.addAttribute("movies", movies);
		return "user_ver_list"; 
	}
	
	@PostMapping("/movies/new")
	public String processMovieForm(@Valid Verification movie, 
			BindingResult result, 
			Model model) {
		model.addAttribute("movie", movie); //new line added
		
		if (result.hasErrors()) {
			return "user_form";
		}		
		userRepository.save(movie);
		return "user_show"; 
	}
	
	
	@GetMapping("/movies/new")
	public String createVerification(Model model) 
	{
		Verification movie = new Verification();
		model.addAttribute("movie", movie);
		return "user_form";
	}
}

	   

