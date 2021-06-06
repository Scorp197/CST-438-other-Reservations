
package cst438.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cst438.domain.CityInfo;
import cst438.domain.Package;
import cst438.domain.PackageRepository;
import cst438.domain.UserRepository;
import cst438.domain.Verification;
import cst438.services.CityService;

@Controller
public class PackageController
{
	@Autowired 
	CityService cityService;

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
   
   @GetMapping("/packages") // A new reservation from a form
   public String PackageHome(Model model)
   {
//      Package packageDeal = new Package();
//      model.addAttribute("packagedeal", packageDeal);
      return "package_site";
   }
   
   @GetMapping("/locations") // A new reservation from a form
   public String PackageLocations(Model model)
   {
//      Package packageDeal = new Package();
//      model.addAttribute("packagedeal", packageDeal);
      return "location_show";
   }
   
   @GetMapping("/florida/locations") // A new reservation from a form
   public String FloridaPackageLocations(Model model)
   {
//      Package packageDeal = new Package();
//      model.addAttribute("packagedeal", packageDeal);
      return "florida_packages";
   }
   
   @GetMapping("/lasvegas/locations") // A new reservation from a form
   public String LasVegasPackageLocations(Model model)
   {
//      Package packageDeal = new Package();
//      model.addAttribute("packagedeal", packageDeal);
      return "lasvegas_packages";
   }
   
   @GetMapping("/losangeles/locations") // A new reservation from a form
   public String LasAngelesPackageLocations(Model model)
   {
//      Package packageDeal = new Package();
//      model.addAttribute("packagedeal", packageDeal);
      return "losangeles_packages";
   }

   @GetMapping("/date") // A new reservation from a form
   public String DepartureDate(Model model)
   {
//      Package packageDeal = new Package();
//      model.addAttribute("packagedeal", packageDeal);
      return "travel_dates";
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
			cityService.requestReservation(cityName, price, email);
			return "available_packages";
			
	} 
}

