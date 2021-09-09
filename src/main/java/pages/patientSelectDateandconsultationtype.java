package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class patientSelectDateandconsultationtype extends TestBase{
	WebDriver driver;


	public patientSelectDateandconsultationtype(WebDriver driver) {

		this.driver=driver;

	}

	public void clickondate() {

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/div[2]/div[4]/div[1]/div[3]/div/div[6]/button/span[1]/div/span[1]")).click();
		log.info("Click on Date....!!!");
		

	}
	
	
	public void clickonTime() {

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/div[2]/div[4]/div[3]/div/div/div[3]/div/div/button[17]/span[1]")).click();
		log.info("Click on Time....!!!");
		

	}
	
	
	
	
	
	public void clickonvideoConsultaion() {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/div[1]/div/div/div/div[4]/div[2]/button/span[1]")).click();
		log.info("click on video consultaion...!!!");
		
	}
	

	public void clickonBookappointment() {

		this.clickondate();
		
	
		this.clickonTime();
		
		this.clickonvideoConsultaion();

	}


}
