package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DoctorLoginpage extends TestBase{

	WebDriver driver;


	public DoctorLoginpage(WebDriver driver) {

		this.driver = driver;

	}


	//Doctor launching url
	public void logindod() {

		driver.get(prop.getProperty("url"));
		log.info("Entering application URL");
		log.warn("Hey this just a warning message");
		log.fatal("Hey this is just fatal error message ");
		log.debug("Hey this is debug message");

		//To click Login button            
		driver.findElement(By.xpath("/html//div[@id='root']//div[@class='jss1']/div[@class='jss2']//div[@class='MuiBox-root jss134']/button[@type='button']/span[@class='MuiButton-label']")).click();


	}

	//Enter With doctor email
	public void enterEmail(String strenterEmail){


		//driver.findElement(By.name("email")).sendKeys(strenterEmail);
		driver.findElement(By.name("email")).sendKeys(strenterEmail);
		log.info("Entering the email");

	}

	//Enter Password
	public void enterPassword(String strenterPassword) {

		driver.findElement(By.name("password")).sendKeys(strenterPassword);

	}

	//click on login button
	public void clickOnLogin() {

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/button[1]/span[1]")).click();

	}

	public void loginToPage(String strenterEmail,String strenterPassword){

		//Navigate to Bronto Page
		this.logindod();




		//Fill user name
		this.enterEmail(strenterEmail);



		//Fill password
		this.enterPassword(strenterPassword);


		
		//Click Login button
		this.clickOnLogin(); 
		
	}

}