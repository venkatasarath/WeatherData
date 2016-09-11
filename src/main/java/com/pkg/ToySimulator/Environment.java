package com.pkg.ToySimulator;

public class Environment {
	
	  private String city;
	  private String pressure;
	  private String latitude;
	  private String condition;
	  private String temp;
	  private String longitude;
	  private String humidity;
	  private String time;

	  public Environment() 
	  {
	  }

	  public String getCity() 
	  { 
		  return city; 
	  }
	  public void setCity(String city) 
	  {
	    this.city = city;
	  }

	  public String getPressure() 
	  { 
		  return pressure; 
	  }
	  public void setPressure(String pressure) 
	  {
	    this.pressure = pressure;
	  }
	  public String getLatitude() 
	  { 
		  return latitude; 
	  }
	  public void setLatitude(String latitude) 
	  {
	    this.latitude = latitude;
	  }
	  public String getCondition() 
	  { 
		  return condition; 
	  }
	  public void setCondition(String condition) 
	  {
	    this.condition = condition;
	  }
	  public String getTemp() 
	  { return temp; 
	  }
	  public void setTemp(String temp) 
	  {
	    this.temp = temp;
	  }

	  public String getLongitude() 
	  { 
		  return longitude; 
	  }
	  public void setLongitude(String longitude) 
	  {
	    this.longitude = longitude;
	  }

	  public String getHumidity() 
	  { 
		  return humidity; 
	  }
	  public void setHumidity(String humidity) 
	  {
		  this.humidity = humidity;
	  }
	  
	  public String getTime() 
	  { 
		  return time; 
	  }
	  public void setTime(String time) 
	  {
		  this.time = time;
	  }
	}