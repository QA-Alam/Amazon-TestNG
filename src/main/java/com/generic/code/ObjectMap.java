package com.generic.code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ObjectMap {

	Properties properties ;
	
	public ObjectMap(String file) throws Throwable {	
		properties = new Properties();
		
			FileInputStream fis = new FileInputStream(file);
			properties.load(fis);
			fis.close();
		
	}
	public String getConfig(String config) {
		String name = properties.getProperty(config);

		return name;

	}

}
