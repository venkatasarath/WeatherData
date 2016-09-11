package com.pkg.ToySimulator;

import java.io.Reader;
import java.io.StringWriter;
import java.io.InputStreamReader;
//import org.apache.log4j.Logger;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class DataFormatter 
{

   // private static Logger log = Logger.getLogger(DataFormatter.class);

    public String format(Environment weather) throws Exception 
    {
        //log.info( "Formatting Weather Data" );
    	System.out.println("\n");
        Reader reader =  new InputStreamReader( getClass().getClassLoader().getResourceAsStream("Prog.Output"));
        VelocityContext con = new VelocityContext();
        con.put("weather", weather );
        StringWriter DataWriter = new StringWriter();
        Velocity.evaluate(con, DataWriter, "", reader);
        return DataWriter.toString();
    }
}