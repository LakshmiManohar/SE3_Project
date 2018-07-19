package com.page.data;

import com.dataManager.DataManager;

public class dataSetup{

			DataManager d = new DataManager("Sys");
			public String chromeDiver = d.getProperty("Sys.Chromedriver");
			
			public String userName = d.getProperty("Sys.UserName");
			public String password = d.getProperty("Sys.Password");
			public String url = d.getProperty("Sys.URL");

}
