package com.pkg.ToySimulator;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
//import org.apache.log4j.Logger;

public class Retriever {

    //private static Logger log = Logger.getLogger(Retriever.class);

    public InputStream retrieve(String code) throws Exception 
    {
        //log.info( "Getting Environment Data" );
    	String url="";
    	if(code=="10")
    	{
        url = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in(select%20woeid%20from%20geo.places(1)%20where%20text%20in%20(%22Melbone%2C%20VIC%22%2C%22Sydney%22%2C%22Alice%20Springs%22%2C%22Armadale%22%2C%22Perth%22%2C%22Broadmeadows%2C%20Scotland%22%2C%22Broome%22%2C%22Cairns%22%2C%22Caloundra%22%2C%22Carnarvon%22))&format=xml";
        
    	}
    	else
    	
    	url = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in(select%20woeid%20from%20geo.places(1)%20where%20text%20in%20(%22"+code+"%22))&format=xml";
        URLConnection conn = new URL(url).openConnection();
    	
        return conn.getInputStream();
    }
}