
package cst438.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
      Iterable<Package> project1 = packageRepository.findAll();
      model.addAttribute("project1", project1);
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
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "package_site";
   }
   
   @GetMapping("/locations") // A new reservation from a form
   public String PackageLocations(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", new Package());
      return "location_show";
   }
   

   @PostMapping("/florida/locations") // A new reservation from a form
   public String FloridaPackageLocations(@Valid Package packageDeal, BindingResult result, Model model) {
	   model.addAttribute("packagedeal", packageDeal);
   {
      if (result.hasErrors())  {
			return "florida_packages";
		}	
//      	packageDeal.setDate(new java.util.Date().toString());
		packageRepository.save(packageDeal);
		return "florida_package_info";
   }
  }
 
   @GetMapping("/florida/locations") // A new reservation from a form
   public String createFloridaPackageLocations(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "florida_packages";
   }
   
   
   @GetMapping("/lasvegas/locations") // A new reservation from a form
   public String LasVegasPackageLocations(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "lasvegas_packages";
   }
   
   @GetMapping("/losangeles/locations") // A new reservation from a form
   public String LosAngelesPackageLocations(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "losangeles_packages";
   }
}


