package com.practice.Interview.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtil {
	
	public Properties setProperties() {
		Properties properties = new Properties();
		try {

			FileInputStream fileDir = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\test\\java\\com\\practice\\Interview\\qa\\config\\config.properties");
			System.out.println("Path of th directory" + System.getProperty("user.dir")
					+ "\\src\\test\\java\\com\\practice\\Interview\\qa\\config\\config.properties");
			properties.load(fileDir);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
	
	// Configure Environment URLs in WebDriverIO
}
