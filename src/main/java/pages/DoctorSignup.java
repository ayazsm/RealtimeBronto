package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DoctorSignup extends TestBase {

	WebDriver driver;

	public DoctorSignup(WebDriver driver) {

		this.driver = driver;
	}



	//Launching Signup URL
	public void launchingsignupurl() {

		driver.get(prop.getProperty("url"));
		log.info("Entering application URL");
		log.warn("Hey this Doctor Signup page message ");
		log.fatal("Hey this is a Doctor signup page okk");
		log.debug("Hey this is debug message");

		//To click Login button            
		driver.findElement(By.xpath("/html//div[@id='root']//div[@class='jss1']/div[@class='jss2']//div[@class='MuiBox-root jss134']/button[@type='button']/span[@class='MuiButton-label']")).click();



	}


	//click on Signup link
	public void signupnow(){

		driver.findElement(By.xpath("/html//div[@id='root']//div[@class='jss1']/div[@class='jss2']/div[@class='jss3']/div[@class='jss5']/div[@class='childContainer']/div/div[2]//p[.='Click here to signup now']")).click();
	}


	//Enter Doctor Name 
	public void doctorname(String strenterName) {

		driver.findElement(By.name("name")).sendKeys(strenterName);

	}

	//Enter Doctor Email 
	public void doctoremail(String strenterEmail){

		driver.findElement(By.name("email")).sendKeys(strenterEmail);
	}

	//Enter Doctor Password 
	public void doctorpassword(String strenterpassword) {

		driver.findElement(By.name("password")).sendKeys(strenterpassword);
	}

	//Enter Doctor Mobile 
	public void doctormobile(String strentermobile) {

		driver.findElement(By.name("mobile")).sendKeys(strentermobile);


	}



	public void clickSignup(String strenterName,String strenterEmail,String strenterpassword,String strentermobile){


		//launching URL for Signup Doctor
		this.launchingsignupurl();


		//Click on Signup button
		this.signupnow(); 


		//Enter Doctor Name 
		this.doctorname(strenterName);


		//Enter Doctor Email 
		this.doctoremail(strenterEmail);


		//Enter Doctor Password      
		this.doctorpassword(strenterpassword);


		//Enter Doctor PhoneNumber
		this.doctormobile(strentermobile);

	}


}


