package com.pkg.ToySimulator;

import java.io.InputStream;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;


public class Main {

    public static void main(String[] args) throws Exception 
    {
    	String code = "10";
        PropertyConfigurator.configure(Main.class.getClassLoader().getResource("log4j.properties"));
        try {
            code = args[0];
        } catch( Exception e ) 
        {}
        
        new Main(code).start();  // Program Start
    }

    private String input;

    public Main(String input) {
        this.input = input;
    }

    public void start() throws Exception 
    {
        InputStream dataIn = new Retriever().retrieve(input);
        List<Environment> envList = new Parser().parse(dataIn);
        
        for(Environment env: envList)
        {
        	System.out.print(new DataFormatter().format(env));
        }
    }
}