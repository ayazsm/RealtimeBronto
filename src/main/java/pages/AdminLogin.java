package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminLogin extends TestBase {

	WebDriver driver;

	public AdminLogin(WebDriver driver) {

		this.driver = driver;

	}

	//Doctor launching url
	public void enterurl() {

		driver.get(prop.getProperty("adminurl"));
		log.info("Entering application URL");
		log.warn("Hey this just a warning message");
		log.fatal("Hey this is just fatal error message ");
		log.debug("Hey this is debug message");


	}	

	//Enter admin Email or PhoneNumber
	public void enterEmail(String strenterEmail){


		//driver.findElement(By.name("email")).sendKeys(strenterEmail);
		driver.findElement(By.name("email")).sendKeys(strenterEmail);
		log.info("Entering the email");


	}

	//Enter admin password
	public void enterpassword(String strenterpassword){


		//driver.findElement(By.name("email")).sendKeys(strenterEmail);
		driver.findElement(By.name("password")).sendKeys(strenterpassword);
		log.info("Entering the password");

	}

	//Click login to Enter for Admin
	public void clicklogin(){


		//driver.findElement(By.name("email")).sendKeys(strenterEmail);
		driver.findElement(By.xpath("/html//div[@id='root']/div[@class='jss1']/main//button[@type='button']/span[@class='MuiButton-label']")).click();
		log.info("Clicking on Admin Login");

	}

	public void loggingtoPage(String strenterEmail,String strenterPassword){

		//url launching for Admin
		this.enterurl();


		//Fill user name
		this.enterEmail(strenterEmail);



		//Fill password
		this.enterpassword(strenterPassword);


		//Click Login button
		this.clicklogin(); 

	}

}