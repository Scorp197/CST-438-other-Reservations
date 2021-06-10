package cst438.domain;

public class CarFind
{
   // Fields from the car website
   int carId;
   String carName;
   String reserveDate;
   String returnDate;
   String carCity;
   double price;

   public CarFind()
   {
   } // Empty Constructor


   public CarFind(int carId)
   {
      this.carId = carId;
   } // Find by Car ID

   public CarFind(int carId, String carName, String reserveDate,
      String returnDate, String carCity, double price)
   {
      super();
      this.carId = carId;
      this.carName = carName;
      this.reserveDate = reserveDate;
      this.returnDate = returnDate;
      this.carCity = carCity;
      this.price = price;
   }

   public CarFind(String reserveDate)
   {
      this.reserveDate = reserveDate;
   } // Find by Car reservation date

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
      {
         return true;
      }
      if (obj == null)
      {
         return false;
      }
      if (getClass() != obj.getClass())
      {
         return false;
      }
      CarFind other = (CarFind) obj;
      if (carId != other.carId)
      {
         return false;
      }
      if (carName == null)
      {
         if (other.carName != null)
         {
            return false;
         }
      } else if (!carName.equals(other.carName))
      {
         return false;
      }
      if (carCity == null)
      {
         if (other.carCity != null)
         {
            return false;
         }
      } else if (!carCity.equals(other.carCity))
      {
         return false;
      }
      if (Double.doubleToLongBits(price) != Double
         .doubleToLongBits(other.price))
      {
         return false;
      }
      if (reserveDate == null)
      {
         if (other.reserveDate != null)
         {
            return false;
         }
      } else if (!reserveDate.equals(other.reserveDate))
      {
         return false;
      }
      if (returnDate == null)
      {
         if (other.returnDate != null)
         {
            return false;
         }
      } else if (!returnDate.equals(other.returnDate))
      {
         return false;
      }
      return true;
   }

   public int getCarId()
   {
      return carId;
   }

   public String getCarName()
   {
      return carName;
   }

   public String getDestinationCity()
   {
      return carCity;
   }

   public double getPrice()
   {
      return price;
   }

   public String getReserveDate()
   {
      return reserveDate;
   }

   public String getReturnDate()
   {
      return returnDate;
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = (prime * result) + carId;
      result = (prime * result) + ((carName == null) ? 0 : carName.hashCode());
      result = (prime * result)
         + ((carCity == null) ? 0 : carCity.hashCode());
      long temp;
      temp = Double.doubleToLongBits(price);
      result = (prime * result) + (int) (temp ^ (temp >>> 32));
      result = (prime * result)
         + ((reserveDate == null) ? 0 : reserveDate.hashCode());
      result = (prime * result)
         + ((returnDate == null) ? 0 : returnDate.hashCode());
      return result;
   }

   public void setCarId(int carId)
   {
      this.carId = carId;
   }

   public void setCarName(String carName)
   {
      this.carName = carName;
   }

   public void setDestinationCity(String carCity)
   {
      this.carCity = carCity;
   }

   public void setPrice(double price)
   {
      this.price = price;
   }

   public void setReserveDate(String reserveDate)
   {
      this.reserveDate = reserveDate;
   }

   public void setReturnDate(String returnDate)
   {
      this.returnDate = returnDate;
   }

   @Override
   public String toString()
   {
      return "CarFind [carId=" + carId + ", carName=" + carName
         + ", reserveDate=" + reserveDate + ", returnDate=" + returnDate
         + ", carCity=" + carCity + ", price=" + price + "]";
   }

}