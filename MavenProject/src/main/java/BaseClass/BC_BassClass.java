package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BC_BassClass {
      
	WebDriver driver;
public void intialization() {	
	 //   System.setProperty("webdriver chrome driver ", "C:\\Program Files\\Java\\jdk-19\\bin");
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	
     
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://demo.nopcommerce.com/login");
  
	}

@AfterMethod
public void Teardown() throws InterruptedException {
	Thread.sleep(3000);

}
}