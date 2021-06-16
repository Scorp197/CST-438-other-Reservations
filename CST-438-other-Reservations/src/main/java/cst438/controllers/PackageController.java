package cst438.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cst438.domain.CarFind;
import cst438.domain.FlightFind;
import cst438.domain.HotelFind;
import cst438.domain.Package;
import cst438.domain.PackageRepository;
import cst438.services.PackageService;

@Controller
public class PackageController
{
   @Autowired
   PackageRepository packageRepository;


   //   @GetMapping("/BostonToWashingtonDC") // A new reservation from a form
   //   public String BostonToSanFranciscoPackageInfo(Model model)
   //   {
   //      Package packageDeal = new Package();
   //      model.addAttribute("packagedeal", packageDeal);
   //      return "BostonToSanFrancisco";
   //   }
   //
   //   @GetMapping("/BostonToWashingtonDC") // A new reservation from a form
   //   public String BostonToWashingtonDCPackageInfo(Model model)
   //   {
   //      Package packageDeal = new Package();
   //      model.addAttribute("packagedeal", packageDeal);
   //      return "BostonToWashingtonDC";
   //   }

   @GetMapping("/package/reserve") // A new reservation from a form
   public String createPackage(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "package_list_show";
   }

   @GetMapping("/package/new") // A new reservation from a form
   public String createPackageInfo(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "available_packages";
   }

   @GetMapping("/package/airline_search")
   public String getAirlineSearch(Model model)
   {
      FlightFind FlightInfo = PackageService.searchFlight("boston", "seattle");
      model.addAttribute("FlightInfo", FlightInfo);
      return "airline_search";
   }

   @GetMapping("/package")
   public String getAllPackageData(Model model)
   {
      Iterable<Package> packageDeal = packageRepository.findAll();
      model.addAttribute("packagedeal", packageDeal);
      return "package_list_show";
   }

   @GetMapping("/package/car_search")
   public String getCarSearch(Model model)
   {
      CarFind carInfo = PackageService.searchCar("boston");
      model.addAttribute("carInfo", carInfo);
      return "car_search";
   }

   @GetMapping("/package/hotel_search")
   public String getHotelSearch(Model model)
   {
      HotelFind hotelInfo = PackageService.searchHotel();
      model.addAttribute("hotelInfo", hotelInfo);
      return "hotel_search";
   }

   @GetMapping("/NewYorkToBoston") // A new reservation from a form
   public String NewYorkToBostonPackageInfo(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "NewYorkToBoston";
   }

   @GetMapping("/NewYorkToSanDiego") // A new reservation from a form
   public String NewYorkToSanDiegoPackageInfo(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "NewYorkToSanDiego";
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

   @PostMapping("/package/new") // Process reservation
   public String processPackageForm(@Valid Package packageDeal,
      BindingResult result, Model model)
   {
      if (result.hasErrors())
      {
         return "available_packages";
      }
      packageRepository.save(packageDeal);
      return "package_show";
   }

   @GetMapping("/SanDiegoToBoston") // A new reservation from a form
   public String SanDiegoToBostonPackageInfo(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "SanDiegoToBoston";
   }

   @GetMapping("/SanDiegoToSanFrancisco") // A new reservation from a form
   public String SanDiegoToSanFranciscoPackageInfo(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "SanDiegoToSanFrancisco";
   }

   @GetMapping("/SanDiegoToSeattle") // A new reservation from a form
   public String SanDiegoToSeattlePackageInfo(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "SanDiegoToSeattle";
   }

   @GetMapping("/SanDiegoToWashingtonDC") // A new reservation from a form
   public String SanDiegoToWashingtonDCPackageInfo(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "SanDiegoToWashingtonDC";
   }

   @GetMapping("/SanFranciscoToBoston") // A new reservation from a form
   public String SanFranciscoToBostonPackageInfo(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "SanFranciscoToBoston";
   }

   @GetMapping("/SanFranciscoToSeattle") // A new reservation from a form
   public String SanFranciscoToSeattlePackageInfo(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "SanFranciscoToSeattle";
   }

   @GetMapping("/SanFranciscoToWashingtonDC") // A new reservation from a form
   public String SanFranciscoToWashingtonDCPackageInfo(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "SanFranciscoToWashingtonDC";
   }

   @GetMapping("/SeattleToNewYork") // A new reservation from a form
   public String SeattletoNewYorkPackageInfo(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "SeattleToNewYork";
   }

   @GetMapping("/SeattleToSanDiego") // A new reservation from a form
   public String SeattleToSanDiegoPackageInfo(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "SeattleToSanDiego";
   }

   @GetMapping("/WashingtonDCToNewYork") // A new reservation from a form
   public String WashingtonDCToNewYorkPackageInfo(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "WashingtonDCToNewYork";
   }

   @GetMapping("/WashingtonDCToSanDiego") // A new reservation from a form
   public String WashingtonDCToSanDiegoPackageInfo(Model model)
   {
      Package packageDeal = new Package();
      model.addAttribute("packagedeal", packageDeal);
      return "WashingtonDCToSanDiego";
   }
}