package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminRole extends TestBase{
	
	WebDriver driver;
	
	public AdminRole(WebDriver driver) {

		this.driver = driver;

	}
	
	//Clicking on Creating the Role
	
	public void CreatingRole() {

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/ul/div/div[4]/div[2]/span/p")).click();
		//log.info("Entering application URL");
		//log.warn("Hey this just a warning message");
		//log.fatal("Hey this is just fatal error message");
		//log.debug("Hey this is debug message");
         log.info("This Element click on ROLE");
         

	}

}
