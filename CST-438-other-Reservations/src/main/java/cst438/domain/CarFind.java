package cst438.domain;

public class CarFind
{
   // Fields from the car website
   int id;
   String make;
   String model;
   String fuel;
   String transmission;
   int year;
   int price;
   String city;

   public CarFind()
   {
   } // Empty Constructor


   public CarFind(int id)
   {
      this.id = id;
   } // Find by Car ID



   public CarFind(int id, String make, String model, String fuel,
      String transmission, int year, int price, String city)
   {
      super();
      this.id = id;
      this.make = make;
      this.model = model;
      this.fuel = fuel;
      this.transmission = transmission;
      this.year = year;
      this.price = price;
      this.city = city;
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
      CarFind other = (CarFind) obj;
      if (city == null)
      {
         if (other.city != null)
         {
            return false;
         }
      } else if (!city.equals(other.city))
      {
         return false;
      }
      if (fuel == null)
      {
         if (other.fuel != null)
         {
            return false;
         }
      } else if (!fuel.equals(other.fuel))
      {
         return false;
      }
      if (id != other.id)
      {
         return false;
      }
      if (make == null)
      {
         if (other.make != null)
         {
            return false;
         }
      } else if (!make.equals(other.make))
      {
         return false;
      }
      if (model == null)
      {
         if (other.model != null)
         {
            return false;
         }
      } else if (!model.equals(other.model))
      {
         return false;
      }
      if (price != other.price)
      {
         return false;
      }
      if (transmission == null)
      {
         if (other.transmission != null)
         {
            return false;
         }
      } else if (!transmission.equals(other.transmission))
      {
         return false;
      }
      if (year != other.year)
      {
         return false;
      }
      return true;
   }


   public String getCity()
   {
      return city;
   }


   public String getFuel()
   {
      return fuel;
   }


   public int getId()
   {
      return id;
   }


   public String getMake()
   {
      return make;
   }


   public String getModel()
   {
      return model;
   }


   public int getPrice()
   {
      return price;
   }


   public String getTransmission()
   {
      return transmission;
   }


   public int getYear()
   {
      return year;
   }


   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = (prime * result) + ((city == null) ? 0 : city.hashCode());
      result = (prime * result) + ((fuel == null) ? 0 : fuel.hashCode());
      result = (prime * result) + id;
      result = (prime * result) + ((make == null) ? 0 : make.hashCode());
      result = (prime * result) + ((model == null) ? 0 : model.hashCode());
      result = (prime * result) + price;
      result = (prime * result)
         + ((transmission == null) ? 0 : transmission.hashCode());
      result = (prime * result) + year;
      return result;
   }


   public void setCity(String city)
   {
      this.city = city;
   }


   public void setFuel(String fuel)
   {
      this.fuel = fuel;
   }


   public void setId(int id)
   {
      this.id = id;
   }


   public void setMake(String make)
   {
      this.make = make;
   }


   public void setModel(String model)
   {
      this.model = model;
   }


   public void setPrice(int price)
   {
      this.price = price;
   }


   public void setTransmission(String transmission)
   {
      this.transmission = transmission;
   }


   public void setYear(int year)
   {
      this.year = year;
   }


   @Override
   public String toString()
   {
      return "CarFind [id=" + id + ", make=" + make + ", model=" + model
         + ", fuel=" + fuel + ", transmission=" + transmission + ", year="
         + year + ", price=" + price + ", city=" + city + "]";
   }


}