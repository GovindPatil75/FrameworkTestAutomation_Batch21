package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	public Properties pro;

	public ConfigDataProvider() throws IOException {
		
		String File=System.getProperty("user.dir")+"\\Config\\Config.Properties";
		FileInputStream fis=new FileInputStream(File);
		pro=new Properties();
		pro.load(fis);
	}
	
	public String getBaseUrl_QA1() {
		return pro.getProperty("BaseUrl_QA1");
	}
	
	public String getBrowserName_Edge() {
		return pro.getProperty("BrowserName_Edge");
	}
	
	public String getBrowserName_Chrome() {
		return pro.getProperty("BrowserName_Chrome");
	}
}
