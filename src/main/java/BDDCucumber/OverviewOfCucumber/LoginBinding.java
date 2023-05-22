package BDDCucumber.OverviewOfCucumber;

import static org.testng.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)

public class LoginBinding {
	public static String URL = "https://petstore.octoperf.com";
	public static WebDriver driver;

	
	@Given("launch the application")
	public void launch_the_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	
	@When("I click on Enter the store")
	public void i_click_on_enter_the_store() {
		driver.findElement(By.xpath("//a[text()='Enter the Store']")).click();

	}
	@When("I click on sign In")
	public void i_click_on_sign_in() {
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	}
	@When("I entered the username {string}")
	public void i_entered_the_username(String string) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
	
	}
	@When("I entered the password {string}")
	public void i_entered_the_password(String string) {
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		   
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	   
	   }
	@When("I clicked on login button")
	public void i_clicked_on_login_button() {

		//driver.findElement(By.xpath("//input[@name='signon']")).clear();
		driver.findElement(By.xpath("//input[@name='signon']")).click();

		
	//    
	}
	@Then("I verified that the user loggedin successfully")
	public void i_verified_that_the_user_loggedin_successfully() {
		String  welcome_content=driver.findElement(By.xpath("//a[text()='Sign Out']")).getText();
    	String Expected_welcome_content="Sign Out";
    	assertEquals(welcome_content, Expected_welcome_content);
    	System.out.println("Login successfully");
	}
	@Then("I closed the application")
	public void i_closed_the_application() {
	   driver.quit();
	}
	
	




    



}