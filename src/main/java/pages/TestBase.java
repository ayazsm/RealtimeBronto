package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	
	public  WebDriver driver;
	public  static Properties prop;
	
	
	@BeforeClass
	public void initialize() throws IOException{
		 
		config();
		
		 System.setProperty("webdriver.chrome.driver","/C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\drivers\\chromedriver\\chromedriver.exe/");
		 driver = new ChromeDriver(); 
		 
	 //To maximize browser
	            driver.manage().window().maximize();
	            
	         //Implicit wait
	        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        	
	 //To open Bronto Application
	            driver.get(prop.getProperty("url"));
	            
	  //To click Login button            
	            driver.findElement(By.xpath("/html//div[@id='root']//div[@class='jss1']/div[@class='jss2']//div[@class='MuiBox-root jss134']/button[@type='button']/span[@class='MuiButton-label']")).click();
	 
	 }
	 
//	@AfterClass
//	 //Test cleanup
//	 public void TeardownTest()
//	 
//	    {
//		 
//	        driver.quit();
//	        
//	    }
	
	public void config(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/test/java/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
