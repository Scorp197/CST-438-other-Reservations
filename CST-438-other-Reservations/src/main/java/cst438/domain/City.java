package cst438.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {

   @Id
   private long id;
   private String name;

   @ManyToOne
   @JoinColumn(name="countrycode", referencedColumnName="code")
   private Country country;
   private String district;
   private int population;

   public City() {
   }

   public City(long id, String name, String district, int population, Country country)
   {
      super();
      this.id = id;
      this.name = name;
      this.district = district;
      this.population = population;
      this.country = country;
   }

   public Country getCountry() {
      return country;
   }
   public String getDistrict() {
      return district;
   }
   public long getId() {
      return id;
   }
   public String getName() {
      return name;
   }
   public int getPopulation() {
      return population;
   }
   public void setCountry(Country country) {
      this.country = country;
   }
   public void setDistrict(String district) {
      this.district = district;
   }
   public void setId(int Id) {
      id = Id;
   }
   public void setName(String name) {
      this.name = name;
   }
   public void setPopulation(int population) {
      this.population = population;
   }

   @Override
   public String toString() {
      return "City [Id=" + id + ", name=" +name + ", district=" + district + ", population=" + population
         + ", country=" + country + "]";
   }
}