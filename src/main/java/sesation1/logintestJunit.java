/*
 * package sesation1;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import org.junit.After; import org.junit.Before; import org.junit.Test;
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * public class logintestJunit { WebDriver driver;
 * 
 * @Before public void launchingBrowser() {
 * System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
 * driver = new ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://www.techfios.com/ibilling/?ng=login/after/dashboard");
 * 
 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 * 
 * }
 * 
 * @Test public void login() throws InterruptedException {
 * driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
 * driver.findElement(By.id("password")).sendKeys("abc123");
 * driver.findElement(By.name("login")).click();
 * 
 * Thread.sleep(4000); }
 * 
 * @After public void tearDown() { driver.close(); } }
 */