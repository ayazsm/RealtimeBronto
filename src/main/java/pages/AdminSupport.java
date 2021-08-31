package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminSupport extends TestBase {


	WebDriver driver;

	public AdminSupport(WebDriver driver) {

		this.driver = driver;

	}


	//Element for clicking On Support
	public void support(){

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/ul/div/div[5]/div[2]/span/p")).click();
		log.info("Clicking On SUPPORT");
	}
	
	
	//Click on Create Support Element
	public void createSupport() {
		
		driver.findElement(By.xpath("//*[@id=\"simple-tab-0\"]/span[1]")).click();
		log.info("Click on Create Support");
		
	}
	

	//Entering the Username of a Support Person
	public void enterUsername(String strenterUsername){
		//driver.findElement(By.name("email")).sendKeys(strenterEmail);
		driver.findElement(By.name("username")).sendKeys(strenterUsername);
		log.info("Entering the Username of a Support Person");

	}



	//Entering the Email 
	public void enterEmail(String strenterEmail){
		//driver.findElement(By.name("email")).sendKeys(strenterEmail);
		driver.findElement(By.name("email")).sendKeys(strenterEmail);
		log.info("Entering the Email");

	}
	
	//Entering the PhoneNo
	public void enterPhoneNo(String strenterPhoneNo){
		//driver.findElement(By.name("email")).sendKeys(strenterEmail);
		driver.findElement(By.name("phone")).sendKeys(strenterPhoneNo);
		log.info("Entering the PhoneNumber");

	}



	//Entering the password 
	public void enterPassword(String strenterPassword){
		//driver.findElement(By.name("email")).sendKeys(strenterEmail);
		driver.findElement(By.name("password")).sendKeys(strenterPassword);
		log.info("Entering the Password");

	}


	public void ClickOnRoleDropdown() {
		driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/p/div/div[2]/div/div[5]/div[2]/div/select")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void SelectRoleDropdown() {
		driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/p/div/div[2]/div/div[5]/div[2]/div/select/option[4]")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	
	public void clickonsubmi() {
		
		driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/p/div/div[2]/div/div[7]/div/button/span[1]")).click();
		
	}



	public void submit(String strenterUsername,String strenterEmail,String strenterPhoneNo,String strenterPassword){

		//click on Support
		this.support();

		
		//clicking on Create Support 
		this.createSupport();

		//Enter the username
		this.enterUsername(strenterUsername);



		//Fill user name
		this.enterEmail(strenterEmail);



		//Fill Phone Number
		this.enterPhoneNo(strenterPhoneNo);



		//Fill password
		this.enterPassword(strenterPassword);
		
		
		//Click on Rolebutton
		this.ClickOnRoleDropdown();
		
		
		//Select the postiton of a Dropdown
		this.SelectRoleDropdown();
		
		
		//Click on SubmitButton of Support
		this.clickonsubmi();

	}

}
