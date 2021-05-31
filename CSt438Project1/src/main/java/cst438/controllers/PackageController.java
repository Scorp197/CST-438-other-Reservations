
package cst438.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cst438.domain.Package;
import cst438.domain.PackageRepository;

@Controller
public class PackageController
{

   @Autowired
   PackageRepository packageRepository;
   
   @GetMapping("/package") // Display packages
   public String getAllPackages(Model model)
   {
      Iterable<Package> packageDeals = packageRepository.findAll();
      model.addAttribute("packagedeals", packageDeals);
      return "package_list";
   }
   
   @PostMapping("/package/new") // Process reservation
   public String processPackageForm(@Valid Package packageDeal, BindingResult result, Model model)
   {
      if(result.hasErrors())
      {
         return "available_packages";
      }
      packageRepository.save(packageDeal);
      return "package_show";
   }
   
   @GetMapping("/package/reserve") // A new reservation from a form
   public String createPackage(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "available_packages";
   }

   @PostMapping("/package/reserves") 
	public String createReservation(

			@RequestParam("cityName") String cityName, 
			@RequestParam("email") String email,
			@RequestParam("price") String price,
			Model model) {
		
			model.addAttribute("cityName", cityName);
			model.addAttribute("price", price);
			model.addAttribute("email", email);
//			Package.availablePackages(cityName, price, email);
			return "available_packages";
			
	} 
}

