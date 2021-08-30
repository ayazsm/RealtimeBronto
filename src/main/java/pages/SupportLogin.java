package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SupportLogin extends TestBase {

	WebDriver driver;

	public SupportLogin(WebDriver driver) {

		this.driver = driver;

	}


	public void supportPersonLogin() {

		driver.get(prop.getProperty("Supporturl"));
		log.info("Entering Support application URL");
		log.warn("Hey this just a warning message");
		log.fatal("Hey this is just fatal error message ");
		log.debug("Hey this is debug message");
	}


	//Entering the Supporrt Person email
	public void entersupportEmail(String strentersupportEmail){
		//driver.findElement(By.name("email")).sendKeys(strenterEmail);
		driver.findElement(By.name("email")).sendKeys(strentersupportEmail);
		log.info("Entering the Supporrt Person email");

	}

	//Entering the Supporrt Person Password
	public void entersupportPassword(String strentersupportPassword){
		//driver.findElement(By.name("email")).sendKeys(strenterEmail);
		driver.findElement(By.name("password")).sendKeys(strentersupportPassword);
		log.info("Entering the Supporrt Person password");

	}

	//E
	public void clickonLoginbtn(){
		//driver.findElement(By.name("email")).sendKeys(strenterEmail);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div/div/div/div[2]/button/span[1]")).click();
		log.info("click on Login Button");

	}


	public void accept(String strentersupportEmail,String strentersupportPassword) {


		//Entering Support application URL
		this.supportPersonLogin();



		//Entering the Supporrt Person email
		this.entersupportEmail(strentersupportEmail);



		//Entering the Supporrt Person Password
		this.entersupportPassword(strentersupportPassword);



		//click on Login Button
		this.clickonLoginbtn();


	}

}
