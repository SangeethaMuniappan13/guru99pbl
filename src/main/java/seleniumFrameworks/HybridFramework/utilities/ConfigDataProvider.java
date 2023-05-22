package seleniumFrameworks.HybridFramework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
Properties pro;
	
	public ConfigDataProvider() {
		
		File src = new  File("/Users/SA20463801/eclipse-workspace/guru99pbl/src/main/java/seleniumFrameworks/HybridFramework/config/config.properties");
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Not able to read config file");
		}
		
		
		
	}
	
	public String getDataFromConfig(String KeyToSearch) {
		
		return pro.getProperty(KeyToSearch);
		
		
	}
	
	public String getBrowser() {
		
		return pro.getProperty("browser");
		
	}
	
public String getStagingURL() {
		
		return pro.getProperty("qaURL");
		
	}

}
