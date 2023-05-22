package seleniumFrameworks.KeywordDrivenFrameWork;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Execution {

	public static void main(String[] args) throws IOException, Exception, IllegalArgumentException, InvocationTargetException 
	{ 
		ExcelSheet rs = new ExcelSheet(); 
	
	Actions k = new Actions(); 
	k.openBrowser(); 
	k.navigate(); 
	k.enterEmail(); 
	k.enterPassword(); 
	k.clickSignIn(); 
	k.logout(); 
	k.closeBrowser();
	System.out.println("Test executed successfully"); 
	}

}
