package sesation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		launchingBrowser();
		login();
		tearDown();
		
	}
	
	 public static void launchingBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techfios.com/ibilling/?ng=login/after/dashboard");
		
	}
	 
	 public static void login() throws InterruptedException {
		 driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
			
		Thread.sleep(4000);
	 }
	 
	 public static void tearDown() {
		 driver.close();
	 }
}
