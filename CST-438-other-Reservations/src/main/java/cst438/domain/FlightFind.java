package cst438.domain;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FlightFind implements List<FlightFind>
{
   // Fields from the airline website
   private int flightId;
   private String airlineName;
   private String departureDate;
   private String departureTime;
   private int numberOfStops;
   private String originCity;
   private String destinationCity;
   private double price;

   public FlightFind()
   {
   } // Empty Constructor

   public FlightFind(int flightId)
   {
      this.flightId = flightId;
   } // Find by Flight ID

   public FlightFind(int flightId, String airlineName, String departureDate,
      String departureTime, int numberOfStops, String originCity,
      String destinationCity, double price)
   {
      this.flightId = flightId;
      this.airlineName = airlineName;
      this.departureDate = departureDate;
      this.departureTime = departureTime;
      this.numberOfStops = numberOfStops;
      this.originCity = originCity;
      this.destinationCity = destinationCity;
      this.price = price;
   }

   public FlightFind(String departureDate)
   {
      this.departureDate = departureDate;
   } // Find by departure date

   @Override
   public boolean add(FlightFind e)
   {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public void add(int index, FlightFind element)
   {
      // TODO Auto-generated method stub

   }

   @Override
   public boolean addAll(Collection<? extends FlightFind> c)
   {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public boolean addAll(int index, Collection<? extends FlightFind> c)
   {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public void clear()
   {
      // TODO Auto-generated method stub

   }

   @Override
   public boolean contains(Object o)
   {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public boolean containsAll(Collection<?> c)
   {
      // TODO Auto-generated method stub
      return false;
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
      FlightFind other = (FlightFind) obj;
      if (airlineName == null)
      {
         if (other.airlineName != null)
         {
            return false;
         }
      } else if (!airlineName.equals(other.airlineName))
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
      if (departureTime == null)
      {
         if (other.departureTime != null)
         {
            return false;
         }
      } else if (!departureTime.equals(other.departureTime))
      {
         return false;
      }
      if (destinationCity == null)
      {
         if (other.destinationCity != null)
         {
            return false;
         }
      } else if (!destinationCity.equals(other.destinationCity))
      {
         return false;
      }
      if (flightId != other.flightId)
      {
         return false;
      }
      if (numberOfStops != other.numberOfStops)
      {
         return false;
      }
      if (originCity == null)
      {
         if (other.originCity != null)
         {
            return false;
         }
      } else if (!originCity.equals(other.originCity))
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

   @Override
   public FlightFind get(int index)
   {
      // TODO Auto-generated method stub
      return null;
   }

   public String getAirlineName()
   {
      return airlineName;
   }

   public String getDepartureDate()
   {
      return departureDate;
   }

   public String getDepartureTime()
   {
      return departureTime;
   }

   public String getDestinationCity()
   {
      return destinationCity;
   }

   public int getFlightId()
   {
      return flightId;
   }

   public int getNumberOfStops()
   {
      return numberOfStops;
   }

   public String getOriginCity()
   {
      return originCity;
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
         + ((airlineName == null) ? 0 : airlineName.hashCode());
      result = (prime * result)
         + ((departureDate == null) ? 0 : departureDate.hashCode());
      result = (prime * result)
         + ((departureTime == null) ? 0 : departureTime.hashCode());
      result = (prime * result)
         + ((destinationCity == null) ? 0 : destinationCity.hashCode());
      result = (prime * result) + flightId;
      result = (prime * result) + numberOfStops;
      result = (prime * result)
         + ((originCity == null) ? 0 : originCity.hashCode());
      long temp;
      temp = Double.doubleToLongBits(price);
      result = (prime * result) + (int) (temp ^ (temp >>> 32));
      return result;
   }

   @Override
   public int indexOf(Object o)
   {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public boolean isEmpty()
   {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public Iterator<FlightFind> iterator()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public int lastIndexOf(Object o)
   {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public ListIterator<FlightFind> listIterator()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public ListIterator<FlightFind> listIterator(int index)
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public FlightFind remove(int index)
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public boolean remove(Object o)
   {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public boolean removeAll(Collection<?> c)
   {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public boolean retainAll(Collection<?> c)
   {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public FlightFind set(int index, FlightFind element)
   {
      // TODO Auto-generated method stub
      return null;
   }

   public void setAirlineName(String airlineName)
   {
      this.airlineName = airlineName;
   }

   public void setDepartureDate(String departureDate)
   {
      this.departureDate = departureDate;
   }

   public void setDepartureTime(String departureTime)
   {
      this.departureTime = departureTime;
   }

   public void setDestinationCity(String destinationCity)
   {
      this.destinationCity = destinationCity;
   }

   public void setFlightId(int flightId)
   {
      this.flightId = flightId;
   }

   public void setNumberOfStops(int numberOfStops)
   {
      this.numberOfStops = numberOfStops;
   }

   public void setOriginCity(String originCity)
   {
      this.originCity = originCity;
   }

   public void setPrice(double price)
   {
      this.price = price;
   }

   @Override
   public int size()
   {
      // TODO Auto-generated method stub
      return 0;
   }

   @Override
   public List<FlightFind> subList(int fromIndex, int toIndex)
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public Object[] toArray()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public <T> T[] toArray(T[] a)
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public String toString()
   {
      return "FlightFind [flightId=" + flightId + ", airlineName=" + airlineName
         + ", departureDate=" + departureDate + ", departureTime="
         + departureTime + ", numberOfStops=" + numberOfStops + ", originCity="
         + originCity + ", destinationCity=" + destinationCity + ", price="
         + price + "]";
   }

}