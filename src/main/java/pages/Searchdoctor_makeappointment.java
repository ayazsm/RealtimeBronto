package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchdoctor_makeappointment extends TestBase{

	WebDriver driver;


	public Searchdoctor_makeappointment(WebDriver driver) {

		this.driver=driver;

	}
	
	public void clickonDashboard() {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/div/div/div[5]/div[1]/button/span[1]")).click();
		log.info("clickonDashboard of a patient.......!!!");
		
	}
	

	public void clickonBookappointment() {


		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div[2]/div/div/div[2]/div/div[4]/div/div/div/div[5]/div/button/span[1]")).click();
		log.info("click on BookAppointment....!!! ");

	}

	public void clickonlocation(String strenterlocation) {


		driver.findElement(By.name("location")).sendKeys(strenterlocation);
		log.info("Enter the location details....!!! ");

	}

	
	public void searchDoctorSpecialist(String strenterdoctorspecialist) {


		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/input")).sendKeys(strenterdoctorspecialist);
		log.info("Enter the Doctor/Specialist name....!!! ");

	}
	
//	public void clickOn	(String strenterdoctorspecialist) {
//
//
//		driver.findElement(By.name("doctorspecialist")).sendKeys(strenterdoctorspecialist);
//		log.info("Enter the Doctor/Specialist name....!!! ");
//
//	}
	
	
  public void searchicon(){
	  
	  driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/button[1]/span[1]/*[1]")).click();
	  
  }
	//*[@id="root"]/div/div/div[2]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/div/div/div[3]/button/span[1]/svg


  public void viewprofile() {
	  
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[4]/div/button[1]/span[1]")).click();
	  log.info("click on VIEW PROFILE of  a Doctor....!!!!");
	  
  }
  
  
  public void selectconsultationtimeslot() {
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/div[2]/div[4]/div[1]/div[3]/div/div[7]/button/span[1]/div/span[1]")).click();
	
	  log.info("selectconsultationtimeslot....!!!");
	  
	  
  }
  
  
  public void clickontime() {
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/div[2]/div[4]/div[3]/div/div/div[3]/div/div/button[5]/span[1]")).click();
	  log.info("click on Doctor Available time ...!!!");
	  
  }
  
  
  public void clickonvideoconsultation() {
	  
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[2]/button/span[1]")).click();
	  
	  log.info("clickonvideoconsultation.....!!");
	  
  }
  
  
  public void clickonself() {
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/div/label[1]/span[1]/span[1]/input")).click();
	  
	  
  }
  
  
  public void enteryourconcerns(String strenterconcerns) {
	  
	  
	  driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/textarea[1]")).sendKeys(strenterconcerns);
	  log.info("Enter your Concerns / Symptoms....!!!");
	  
	  
  }
  
  
  
  public void checkbox() {
	  
	  driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[10]/label[1]/span[1]/span[1]/input[1]")).click();
	  log.info("Click on Checkbox....!!!");
  }
  

  public void proceedpayment() {
	  
	  driver.findElement(By.xpath("//span[contains(text(),'Proceed to Payment')]")).click();
	  log.info("Click on Proceed to payment");
  }
  
  
  
  public void bookappointment(String strenterlocation,String strenterdoctorspecialist,String strenterconcerns){
	  
	  
	this.clickonDashboard();  
		
	this.clickonBookappointment();
	
	
	this.clickonlocation(strenterlocation);
	
	
	this.searchDoctorSpecialist(strenterdoctorspecialist);
	
	
	this.searchicon();
	
	this.viewprofile();
	
	
	this.selectconsultationtimeslot();
	
	
	this.clickontime();
	
	
	
	this.clickonvideoconsultation();
	
   this.clickonself();
	
	this.enteryourconcerns(strenterconcerns);
	
	this.checkbox();
	
	
	this.proceedpayment();
		
	}
 
}
