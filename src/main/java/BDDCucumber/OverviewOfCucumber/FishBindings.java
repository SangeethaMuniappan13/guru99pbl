package BDDCucumber.OverviewOfCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FishBindings {

	public static String URL = "https://petstore.octoperf.com";
	public static WebDriver driver;
	
	@Given("Login and find Fish button")
	public void login_and_find_fish_button() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		driver.findElement(By.xpath("//a[text()='Enter the Store']")).click();
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("whistler@123");
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		   
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("j2ee");
		driver.findElement(By.xpath("//input[@name='signon']")).click();

	}




	@When("I clicked on Fish")
	public void i_clicked_on_fish() {
		driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']")).click();

	}

	@When("I clicked on FI-SW-{int}")
	public void i_clicked_on_fi_sw(Integer int1) {
		driver.findElement(By.xpath("//a[text()='FI-SW-01']")).click();

	}

	@When("I clicked on EST-{int}")
	public void i_clicked_on_est(Integer int1) {
		driver.findElement(By.xpath("//a[text()='EST-1']")).click();

	}

	@When("I clicked on Add to Cart")
	public void i_clicked_on_add_to_cart() {
		driver.findElement(By.xpath("//a[text()='Add to Cart']")).click();

	}

	@When("I clicked on Proceed to Checkout")
	public void i_clicked_on_proceed_to_checkout() {
		driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();

	}

	@When("I clicked on Continue")
	public void i_clicked_on_continue() {
		driver.findElement(By.xpath("//input[@name='newOrder']")).click();

	}

	@When("I clicked on Confirm")
	public void i_clicked_on_confirm() {
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();

	}
	@Then("I closed the Fish_application")
	public void i_closed_the_fish_application() {
		driver.quit();
	}
	

}
