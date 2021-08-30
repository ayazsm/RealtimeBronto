package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SupportTicketInformation extends TestBase {

	WebDriver driver;

	public SupportTicketInformation(WebDriver driver) {

		this.driver = driver;

	}


	//Ticket Information Dashboard
	public void TicketInformation(){
		//driver.findElement(By.name("email")).sendKeys(strenterEmail);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[2]/div/div/div/div/div[1]/div/div/img")).click();
		log.info("Ticket Information Dashboard visible");

	}

	
	public void TktInformation() {
		
		
		//click on Bronto Plus Ticket Information
		this.TicketInformation();
		
		
		
	}
	
}

