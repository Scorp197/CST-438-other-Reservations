package cst438.domain;

public class CityInfo {
	

	public long id;
	public String name;
	public String countryCode;
	public String countryName;
	public String district;
	public int population;
	public double temp;
	public String time;
	
	

	public CityInfo(City city, double temp, String time) {
		this.id = city.getId();
		this.name = city.getName();
		this.countryCode = city.getCountry().getCode();
		this.countryName = city.getCountry().getName();
		this.district = city.getDistrict();
		this.population = city.getPopulation();
		this.temp = temp;
		this.time = time;
			
		}
	
	//used by  test cases
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CityInfo other = (CityInfo) obj;
		if (id != other.id)
			return false;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (population != other.population)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
		
}
