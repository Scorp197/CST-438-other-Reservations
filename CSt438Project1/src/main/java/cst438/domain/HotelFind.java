package cst438.domain;

public class HotelFind
{
   int hotelId;
   String hotelName;
   String arrivalDate;
   String departureDate;
   String hotelCity;
   double price;

   public HotelFind()
   {
   } // Empty Constructor

   public HotelFind(int hotelId, String hotelName, String arrivalDate,
      String departureDate, String hotelCity, double price)
   {
      super();
      this.hotelId = hotelId;
      this.hotelName = hotelName;
      this.arrivalDate = arrivalDate;
      this.departureDate = departureDate;
      this.hotelCity = hotelCity;
      this.price = price;
   }

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
      HotelFind other = (HotelFind) obj;
      if (arrivalDate == null)
      {
         if (other.arrivalDate != null)
         {
            return false;
         }
      } else if (!arrivalDate.equals(other.arrivalDate))
      {
         return false;
      }
      if (departureDate == null)
      {
         if (other.departureDate != null)
         {
            return false;
         }
      } else if (!departureDate.equals(other.departureDate))
      {
         return false;
      }
      if (hotelCity == null)
      {
         if (other.hotelCity != null)
         {
            return false;
         }
      } else if (!hotelCity.equals(other.hotelCity))
      {
         return false;
      }
      if (hotelId != other.hotelId)
      {
         return false;
      }
      if (hotelName == null)
      {
         if (other.hotelName != null)
         {
            return false;
         }
      } else if (!hotelName.equals(other.hotelName))
      {
         return false;
      }
      if (Double.doubleToLongBits(price) != Double
         .doubleToLongBits(other.price))
      {
         return false;
      }
      return true;
   }

   public String getArrivalDate()
   {
      return arrivalDate;
   }

   public String getDepartureDate()
   {
      return departureDate;
   }

   public String getHotelCity()
   {
      return hotelCity;
   }

   public int getHotelId()
   {
      return hotelId;
   }

   public String getHotelName()
   {
      return hotelName;
   }

   public double getPrice()
   {
      return price;
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = (prime * result)
         + ((arrivalDate == null) ? 0 : arrivalDate.hashCode());
      result = (prime * result)
         + ((departureDate == null) ? 0 : departureDate.hashCode());
      result = (prime * result)
         + ((hotelCity == null) ? 0 : hotelCity.hashCode());
      result = (prime * result) + hotelId;
      result = (prime * result)
         + ((hotelName == null) ? 0 : hotelName.hashCode());
      long temp;
      temp = Double.doubleToLongBits(price);
      result = (prime * result) + (int) (temp ^ (temp >>> 32));
      return result;
   }

   public void setArrivalDate(String arrivalDate)
   {
      this.arrivalDate = arrivalDate;
   }

   public void setDepartureDate(String departureDate)
   {
      this.departureDate = departureDate;
   }

   public void setHotelCity(String hotelCity)
   {
      this.hotelCity = hotelCity;
   }

   public void setHotelId(int hotelId)
   {
      this.hotelId = hotelId;
   }

   public void setHotelName(String hotelName)
   {
      this.hotelName = hotelName;
   }

   public void setPrice(double price)
   {
      this.price = price;
   }

   @Override
   public String toString()
   {
      return "HotelFind [hotelId=" + hotelId + ", hotelName=" + hotelName
         + ", arrivalDate=" + arrivalDate + ", departureDate=" + departureDate
         + ", hotelCity=" + hotelCity + ", price=" + price + "]";
   }

}
