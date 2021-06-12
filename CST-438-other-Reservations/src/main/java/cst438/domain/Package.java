package cst438.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Package

{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private long packageId;

   private long userId;
   private long airlineId;
   private long hotelId;
   private long carId;
   private String pkgDescription;

   //@NotNull
   @Size(min=3, max=25)
   private String destination;

   //@NotNull
   @Size(min=3, max=25)
   private String departureDate;

   //@NotNull
   @Size(min=3, max=25)
   private String returnDate;

   //@NotNull
   @Size(min=3, max=25)
   private String originCity;

   public Package()
   {

   }


   public Package(long packageId, long userId, long airlineId,
      long hotelId, long carId, String pkgDescription, String destination, String departureDate, String returnDate, String originCity)
   {
      super();
      this.packageId = packageId;
      this.userId = userId;
      this.airlineId = airlineId;
      this.hotelId = hotelId;
      this.carId = carId;
      this.pkgDescription = pkgDescription;
      this.destination = destination;
      this.departureDate = departureDate;
      this.returnDate = returnDate;
      this.originCity = originCity;
   }

   public long getAirlineId()
   {
      return airlineId;
   }

   public long getCarId()
   {
      return carId;
   }

   public String getDepartureDate() {
      return departureDate;
   }

   public String getDestination() {
      return destination;
   }

   public long getHotelId()
   {
      return hotelId;
   }

   public String getOriginCity() {
      return originCity;
   }

   public long getPackageId()
   {
      return packageId;
   }

   public String getPkgDescription()
   {
      return pkgDescription;
   }

   public String getReturnDate() {
      return returnDate;
   }

   public long getUserId()
   {
      return userId;
   }

   public void setAirlineId(long airlineId)
   {
      this.airlineId = airlineId;
   }

   public void setCarId(long carId)
   {
      this.carId = carId;
   }

   public void setDepartureDate(String departureDate) {
      this.departureDate = departureDate;
   }

   public void setDestination(String destination) {
      this.destination = destination;
   }

   public void setHotelId(long hotelId)
   {
      this.hotelId = hotelId;
   }

   public void setOriginCity(String originCity) {
      this.originCity = originCity;
   }

   public void setPackageId(long packageId)
   {
      this.packageId = packageId;
   }

   public void setPkgDescription(String pkgDescription)
   {
      this.pkgDescription = pkgDescription;
   }

   public void setReturnDate(String returnDate) {
      this.returnDate = returnDate;
   }

   public void setUserId(long userId)
   {
      this.userId = userId;
   }

}