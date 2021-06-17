package cst438.domain;

public class HotelFind
{
   int id;
   int hotelId;
   String name;
   String arrivalDate;
   String departureDate;
   String hotelCity;
   int price;
   String address;
   String type;
   int maxPeople;

   public HotelFind()
   {
   } // Empty Constructor

   public HotelFind(int id)
   {
      this.id = id;
   } // Find by hotel ID

   public HotelFind(int id, int hotelId, String type, int maxPeople)
   {
      // https://cst438-hotel-dev.herokuapp.com/api/rooms/1
      super();
      this.id = id;
      this.hotelId = hotelId;
      this.type = type;
      this.maxPeople = maxPeople;
   }

   public HotelFind(int id, int hotelId, String name, String arrivalDate,
      String departureDate, String hotelCity, int price, String address,
      String type, int maxPeople)
   {
      super();
      this.id = id;
      this.hotelId = hotelId;
      this.name = name;
      this.arrivalDate = arrivalDate;
      this.departureDate = departureDate;
      this.hotelCity = hotelCity;
      this.price = price;
      this.address = address;
      this.type = type;
      this.maxPeople = maxPeople;
   }

   public HotelFind(int id, String name, String address)
   {
      // https://cst438-hotel-dev.herokuapp.com/api/hotels
      super();
      this.id = id;
      this.name = name;
      this.address = address;
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
      if (address == null)
      {
         if (other.address != null)
         {
            return false;
         }
      } else if (!address.equals(other.address))
      {
         return false;
      }
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
      if (id != other.id)
      {
         return false;
      }
      if (maxPeople != other.maxPeople)
      {
         return false;
      }
      if (name == null)
      {
         if (other.name != null)
         {
            return false;
         }
      } else if (!name.equals(other.name))
      {
         return false;
      }
      if (price != other.price)
      {
         return false;
      }
      if (type == null)
      {
         if (other.type != null)
         {
            return false;
         }
      } else if (!type.equals(other.type))
      {
         return false;
      }
      return true;
   }

   public String getAddress()
   {
      return address;
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

   public int getId()
   {
      return id;
   }

   public int getMaxPeople()
   {
      return maxPeople;
   }

   public String getName()
   {
      return name;
   }

   public int getPrice()
   {
      return price;
   }

   public String getType()
   {
      return type;
   }

   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = (prime * result) + ((address == null) ? 0 : address.hashCode());
      result = (prime * result)
         + ((arrivalDate == null) ? 0 : arrivalDate.hashCode());
      result = (prime * result)
         + ((departureDate == null) ? 0 : departureDate.hashCode());
      result = (prime * result)
         + ((hotelCity == null) ? 0 : hotelCity.hashCode());
      result = (prime * result) + hotelId;
      result = (prime * result) + id;
      result = (prime * result) + maxPeople;
      result = (prime * result) + ((name == null) ? 0 : name.hashCode());
      result = (prime * result) + price;
      result = (prime * result) + ((type == null) ? 0 : type.hashCode());
      return result;
   }

   public void setAddress(String address)
   {
      this.address = address;
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

   public void setId(int id)
   {
      this.id = id;
   }

   public void setMaxPeople(int maxPeople)
   {
      this.maxPeople = maxPeople;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public void setPrice(int price)
   {
      this.price = price;
   }

   public void setType(String type)
   {
      this.type = type;
   }

   @Override
   public String toString()
   {
      return "HotelFind [id=" + id + ", hotelId=" + hotelId + ", name=" + name
         + ", arrivalDate=" + arrivalDate + ", departureDate=" + departureDate
         + ", hotelCity=" + hotelCity + ", price=" + price + ", address="
         + address + ", type=" + type + ", maxPeople=" + maxPeople + "]";
   }


}
