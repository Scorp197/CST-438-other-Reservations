package cst438.domain;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Package

{
   @Id
   @GeneratedValue
   private long packageId;

   private boolean reserved;
   private long userId;
   private long airlineId;
   private long hotelId;
   private long carId;
   private String pkgDescription;

   public Package()
   {

   }

   public Package(long packageId, boolean reserved, long userId, long airlineId,
      long hotelId, long carId, String pkgDescription)
   {
      super();
      this.packageId = packageId;
      this.reserved = reserved;
      this.userId = userId;
      this.airlineId = airlineId;
      this.hotelId = hotelId;
      this.carId = carId;
      this.pkgDescription = pkgDescription;
   }

   public long getAirlineId()
   {
      return airlineId;
   }

   public long getCarId()
   {
      return carId;
   }

   public long getHotelId()
   {
      return hotelId;
   }

   public long getPackageId()
   {
      return packageId;
   }

   public String getPkgDescription()
   {
      return pkgDescription;
   }

   public long getUserId()
   {
      return userId;
   }

   public boolean isReserved()
   {
      return reserved;
   }

   public void setAirlineId(long airlineId)
   {
      this.airlineId = airlineId;
   }

   public void setCarId(long carId)
   {
      this.carId = carId;
   }

   public void setHotelId(long hotelId)
   {
      this.hotelId = hotelId;
   }

   public void setPackageId(long packageId)
   {
      this.packageId = packageId;
   }

   public void setPkgDescription(String pkgDescription)
   {
      this.pkgDescription = pkgDescription;
   }

   public void setReserved(boolean reserved)
   {
      this.reserved = reserved;
   }

   public void setUserId(long userId)
   {
      this.userId = userId;
   }

}