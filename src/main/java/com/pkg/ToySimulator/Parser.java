package com.pkg.ToySimulator;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
//import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;



public class Parser {
//private static Logger log = Logger.getLogger(Parser.class);

	  public List<Environment> parse(InputStream inputStream) throws Exception 
	  {
	    Environment env = new Environment();	    
	    List<Environment> envList= new ArrayList<Environment>();	
	    //log.info("Reading XML");	
	    try
	    {
	    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(inputStream);
		
		NodeList CityList = doc.getElementsByTagName("yweather:location");
		NodeList PositionlatList = doc.getElementsByTagName("geo:lat");
		NodeList PositionlonList = doc.getElementsByTagName("geo:long");
		NodeList humidList = doc.getElementsByTagName("yweather:atmosphere");
		NodeList ConditionList = doc.getElementsByTagName("yweather:condition");
		NodeList Time = doc.getElementsByTagName("query");
		
		for (int temp = 0; temp < CityList.getLength(); temp++) 
		{	
				Element city = (Element) (CityList.item(temp));
				Element latitude = (Element) (PositionlatList.item(temp));
				Element longitude = (Element) (PositionlonList.item(temp));
				Element cond = (Element) (ConditionList.item(temp));
				Element humidity = (Element) (humidList.item(temp));
				Element time = (Element) (Time.item(0));
				env = new Environment();
	
			    //log.info( "Getting Response" );
			    env.setCity(city.getAttribute("city") );
			    env.setLatitude(latitude.getTextContent() );
			    env.setLongitude(longitude.getTextContent() );
			    env.setCondition(cond.getAttribute("text"));
			    env.setHumidity(humidity.getAttribute("humidity"));
			    env.setPressure(humidity.getAttribute("pressure"));
			    env.setTemp(cond.getAttribute("temp"));
			    env.setTime(time.getAttribute("yahoo:created").replaceAll("[A-Z]"," "));
			   
			    envList.add(env);
	
		}
		
	}
	    catch(Exception e){
	    	e.printStackTrace();
	    }
    
    
   
	return envList;
        
    

    
  }


}