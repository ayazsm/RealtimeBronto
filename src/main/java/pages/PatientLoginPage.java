package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class PatientLoginPage extends TestBase{
    WebDriver driver;
    
    
	public PatientLoginPage(WebDriver driver) {
		
		this.driver=driver;

	}
	//Url details
		public void uRLDetails() throws IOException{
			driver.get(prop.getProperty("url"));
	        //System.out.println("Navigated to bronto application");
	        log.info("Naviated to Bronto Home Page");
	        
	       
//	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	        
//	        File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(src1, new File("screenshots//screenshot1.png"));
//			Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\Codetru\\eclipselevel\\pom\\screenshots\\screenshot1.png\">Screenshot1</a>");
//			Reporter.log("<img src=\"C:\\Users\\Codetru\\eclipselevel\\pom\\screenshots\\screenshot1.png\"/>");


	        
	//To click Login button            
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/header/div/div/div[4]/div/button/span[1]")).click();
	        //System.out.println("Click on login ");
	        log.info("Click on login/Register button");
	      
		}


	
	public void clickLoginAsPatient() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/button[2]/span[1]")).click();
		//System.out.println("click login as patient");
		log.info("click login as patient ");
	}
	
	public void enterEmailId(String strenterEmailId) {
		driver.findElement(By.name("email")).sendKeys(strenterEmailId);
		//System.out.println("Enter EmailId");
		log.info("Enter EmailId");
	}
	
	public void enterpassword(String strenterpassword1) {
		driver.findElement(By.name("password")).sendKeys(strenterpassword1);
		//System.out.println("Enter password");
		log.info("Enter password");
		
	
	}
	
	public void clickLogin() {
		//System.out.println("Click on login now");
		log.info("Click on login now");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/button[1]/span[1]")).click();
		log.info("Patient login Test successfull");
	}
	
	public void loginToPatient(String strenterEmailId,String strenterpassword1) throws IOException {
		
		this.uRLDetails();
		
		this.clickLoginAsPatient();
		//Enter the Patient Login EmailID
		this.enterEmailId(strenterEmailId);

		
		//Enter the Patient Login Password
        this.enterpassword(strenterpassword1);
        
        this.clickLogin();
        

	}
	
}