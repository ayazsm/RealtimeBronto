package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DoctorAddingFees extends TestBase{

	WebDriver driver;
	
	public DoctorAddingFees(WebDriver driver) {

		this.driver = driver;

	}
	
	
	
	public void clickonFees() {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/header/div/div/div[2]/div/div[2]/div/div[4]/button/span[1]")).click();
	}
	
	public void clickonEditbtn() {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[3]/button/span[1]")).click();
	}
	
	
	
	
	public void videoConsultation(String strVideoFeesdoctor) {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div/div/input")).sendKeys(strVideoFeesdoctor);
		log.info("After Booking Time Slot, Doctor Entering his Fees...!");
	}
	
	
	public void doctorAvailabledate(String strVideoFeesdoctordate) {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[4]/div/div/div/input")).sendKeys(strVideoFeesdoctordate);
		log.info("After Booking Time Slot, Doctor Entering his Availability Time...!");
	}
	
	public void clickonSavebutton() {
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[4]/button/span[1]")).click();
		log.info("After entering fees and consultation date click on save button......!!!");
		
	}
	
	
	public void addingFEES(String strVideoFeesdoctor,String strVideoFeesdoctordate) {
		
		
		
		this.clickonFees();
		
	//After Booking Time Slot, Doctor Entering his Fees...!
		this.clickonEditbtn();
	
	this.videoConsultation(strVideoFeesdoctor);
	this.doctorAvailabledate(strVideoFeesdoctordate);
	this.clickonSavebutton();
		
	}
	
}
