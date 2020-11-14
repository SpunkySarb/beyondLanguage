package com.example.beyondLangiage;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class BeyondLangiageApplication {

	public static void main(String[] args)  {
	   
	   
	   load();
		SpringApplication.run(BeyondLangiageApplication.class, args);
	}

	
	
public static void load() {
    String url="http://localhost:8081";
    try {
        Desktop.getDesktop().browse(new URL(url).toURI());
    } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (URISyntaxException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
	
	
	
	
	
	
	
	
}
