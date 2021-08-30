package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DoctorLoginpage extends TestBase{

	WebDriver driver;


	public DoctorLoginpage(WebDriver driver) {

		this.driver = driver;
		
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

		driver.findElement(By.xpath("/html//div[@id='root']//div[@class='jss1']/div[@class='jss2']/div[@class='jss3']/div[@class='jss5']//div[@class='MuiBox-root jss174']/div/button[1]/span[@class='MuiButton-label']")).click();

	}

	public void loginToPage(String strenterEmail,String strenterPassword){


		//Fill user name
		this.enterEmail(strenterEmail);



		//Fill password
		this.enterPassword(strenterPassword);


		//Click Login button
		this.clickOnLogin(); 

	}

}