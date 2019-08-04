package com.generic.code;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ObjectModale {

private Properties properties;
	
	public ObjectModale(String file) {
		
		
		this.properties = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(file);
				properties.load(fis);
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
	}
		
	public String getConfig(String config)	{
		
		
		String name = properties.getProperty(config);
		
		return name;
		
		
		
	}
		
		

	
	
	
}

