package pages;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class TestBase {

	public  WebDriver driver;
	public  static Properties prop;
	Logger log = Logger.getLogger(TestBase.class);

	
//	@BeforeMethod
//	public void setup() {
//		
//		System.setProperty("webdriver.chromedriver.driver", "/C:/Users/Codet/eclipse-workspace/BrontoDoctor/drivers/chromedriver/chromedriver.exe");
//		
//	}
//	
	
	

	@BeforeClass
	public void initialize() throws IOException{
		
		log.info("*****************************Starting Test Cases**************************");

		config();
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setHeadless(true);
		
		
		//Chrome Driver For Windows
		//System.setProperty("webdriver.chrome.driver","drivers\\ChromeDriver\\chromedriver.exe");
//      WebDriver driver = new ChromeDriver(chromeOptions);
		
//		new DesiredCapabilities();
//        URL serverurl = new URL("http://localhost:9515");
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        WebDriver driver = new RemoteWebDriver(serverurl,capabilities);
//		//Chrome Driver For Linux
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Codet\\eclipse-workspace\\BrontoDoctor\\drivers\\ChromeDriver\\chromedriver.exe");
		
		driver = new ChromeDriver(); 
		log.info("Launching chrome browser");

		//To maximize browser
		driver.manage().window().maximize();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@AfterClass
	//Test cleanup
	public void TeardownTest()

	{

		//driver.quit();
		
		log.info("***************************  Browser is closed  **********************************");

	}

	
	public void config(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/Configurations/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	

}














