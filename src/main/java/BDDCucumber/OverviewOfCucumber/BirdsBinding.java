package BDDCucumber.OverviewOfCucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BirdsBinding {

	public static String URL = "https://petstore.octoperf.com";
	public static WebDriver driver;

	@Given("Login and find Birds button")
	public void login_and_find_birds_button() {
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

	@When("I clicked on Birds")
	public void i_clicked_on_birds() {
		driver.findElement(By.xpath("//img[@src='../images/birds_icon.gif']")).click();

	}

	@When("I clicked on AV-CB-{int}")
	public void i_clicked_on_av_cb(Integer int1) {

		driver.findElement(By.xpath("//a[text()='AV-CB-01']")).click();

	}

	@Given("^I clicked on EST_Eighteen$")
    public void i_clicked_on_esteighteen() throws Throwable {
		driver.findElement(By.xpath("//a[text()='EST-18']")).click();

    }

//	
	@When("I clicked on Add to Cart for birds")
	public void i_clicked_on_add_to_cart_for_birds() {

		driver.findElement(By.xpath("//a[text()='Add to Cart']")).click();

	}

	@When("I clicked on Proceed to Checkout for birds")
	public void i_clicked_on_proceed_to_checkout_for_birds() {

		driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();

	}

	@When("I clicked on Continue for birds")
	public void i_clicked_on_continue_for_birds() {

		driver.findElement(By.xpath("//input[@name='newOrder']")).click();

	}

	@When("I clicked on Confirm  for birds")
	public void i_clicked_on_confirm_for_birds() {

		driver.findElement(By.xpath("//a[text()='Confirm']")).click();

	}

	@Then("I closed the Birds_application")
	public void i_closed_the_birds_application() {
		driver.quit();

	}

}
