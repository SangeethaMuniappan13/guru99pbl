package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question3 {

	public static String URL = "https://opensource-demo.orangehrmlive.com";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// step2
		driver.get(URL);
		Thread.sleep(3000);

		// enter username

		String XpathForUserName = "//input[@placeholder='Username']";
		driver.findElement(By.xpath(XpathForUserName)).sendKeys("Admin");

		// enter password
		String XpathForPassword = "//input[@placeholder='Password']";
		driver.findElement(By.xpath(XpathForPassword)).sendKeys("admin123");

		// click login
		String XpathForLogin = "//button[@type='submit']";
		driver.findElement(By.xpath(XpathForLogin)).click();
		Thread.sleep(3000);

		// click admin
		String XpathForAdmin = "//a[@href='/web/index.php/admin/viewAdminModule']";
		driver.findElement(By.xpath(XpathForAdmin)).click();
		Thread.sleep(3000);

		// click logoutlogo
		String XpathForLogoutlogo = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']";
		driver.findElement(By.xpath(XpathForLogoutlogo)).click();
		Thread.sleep(3000);

		// click logout
		String XpathForLogout = "//a[@href='/web/index.php/auth/logout']";
		driver.findElement(By.xpath(XpathForLogout)).click();
		Thread.sleep(3000);
		// close the browser
		driver.quit();

	}

}
