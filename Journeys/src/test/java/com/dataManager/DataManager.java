package com.dataManager;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class DataManager {
	
	String fileName;
	Properties properties;
	
	public DataManager(String fileName){
		
		this.fileName = fileName;
		
	}
	
	
	public void loadFile() throws Exception{
		properties = new Properties();
		File src = new File("./ConfigFiles/"+fileName+".properties");
		FileReader fis = new FileReader(src);
			properties.load(fis);
		}
	
	public String getProperty(String data){
		try{
		loadFile();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		String value = properties.getProperty(data);
		return value;
	}

}
