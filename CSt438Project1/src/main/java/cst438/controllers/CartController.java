package cst438.controllers;



import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import cst438.domain.Package;
import cst438.domain.PackageRepository;


@Controller
@RequestMapping("cart")
public class CartController {
	
	@Autowired
	private PackageRepository packageRepository;
	
	 
	  
//	   @GetMapping("/package")
	@RequestMapping(method = RequestMethod.GET)
	   public String index(Model model)
	   {
//	      Iterable<Package> packageDeal = packageRepository.findAll();
//	      model.addAttribute("packagedeal", packageDeal);
	      return "cart";
	   }

	   
//	   @GetMapping("/package")
	   @RequestMapping(value = "buy/{packageId}", method = RequestMethod.GET)
	   public String buy(@PathVariable ("packageId") long packageId, Model model, 
			   HttpSession session) 
	   {
		   System.out.println(packageId);
	     
	      
	      if(session.getAttribute("cart") == null) {
	    	  Iterable<Package> packageDeal = packageRepository.findAll();
	    	  model.addAttribute("packagedeal", packageDeal);
	    	  List<Package> cart = new ArrayList<Package>();
	    	  System.out.println(cart);
	    	  cart.add(new Package(packageRepository.findAll()));
	    	  session.setAttribute("cart", cart);
	    	  
	      } else {
	    	 
	    	  
	      }
	      return "redirect:../../cart";
	   }
	}
