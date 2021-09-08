package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Select;

public class MakeAppoinmentsPage extends TestBase{

	WebDriver driver;


	public MakeAppoinmentsPage(WebDriver driver) {

		this.driver = driver;

	}

	public void clickOnDashboard() {

		driver.findElement(By.cssSelector("div.jss1 div.jss2:nth-child(2) header.MuiPaper-root.MuiAppBar-root.MuiAppBar-positionStatic.MuiAppBar-colorPrimary.jss38.MuiPaper-elevation4 div.childContainer div.MuiGrid-root.MuiGrid-container.MuiGrid-align-items-xs-center div.MuiGrid-root.MuiGrid-container.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-sm-12.MuiGrid-grid-md-7.MuiGrid-grid-lg-7:nth-child(2) div.MuiTabs-root div.MuiTabs-scroller.MuiTabs-scrollable div.MuiTabs-flexContainer div.MuiGrid-root.MuiGrid-container.MuiGrid-item.MuiGrid-grid-xs-6.MuiGrid-grid-lg-6:nth-child(1) button.MuiButtonBase-root.MuiButton-root.MuiButton-text.jss51.jss78 > span.MuiButton-label")).click();
		log.info("Clicking on Calender......");
	}


	public void clickOnCalender() {

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/header/div/div/div[2]/div/div[2]/div/div[3]/button")).click();
		log.info("Clicking on Calender......");
	}

	public void clickOnTimeSlot() {

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/button/span[1]")).click();
		log.info("Clicking on TimeSlot ......");
	}

	
	//A which date i selected 12 SEP 2021 
	public  void selectDate() {

		//driver.findElement(By.xpath("/html//div[@id='root']//div[@class='jss1']/div[@class='jss2']/div[@class='jss3']//div[@class='jss158']//div[@class='MuiTabs-root']/div[3]/div[@role='tablist']/div[@value='7']/button[@type='button']//div[@class='center']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div[4]/div/div/div[3]/div/div[10]/button/span[1]/div")).click();
		log.info("Clicking on Date ......");

	}
	public  void ClickOnAddSlot() {


		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div[5]/div/div/div/div[2]/p")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div[5]/div/div/div/div[2]/p")).click();
		log.info("Clicking on ADD Slot ......");

	}
	public  void ClickOnConsulttypeDropdown() {

		driver.findElement(By.xpath("//div[@id='mui-component-select-consultation_type']")).click();
		log.info("Clicking on consult type Dropdown ......");

	}
	public  void SelectOnConsulttype() {

		driver.findElement(By.xpath("//li[normalize-space()='Video']")).click();
		log.info("select consult type ......");

	}

	public  void StarttimeClick(String strenterstarttime) {

		driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys(strenterstarttime);
		log.info("Click on Start time ......");

	}


	public  void endtimeClick(String strenterendtime) {

		driver.findElement(By.name("end_hour")).sendKeys(strenterendtime);
		log.info("Click on end time ......");

	}

	


	public void time_Interval(String strtime_interval) {

		driver.findElement(By.name("time_interval")).sendKeys(strtime_interval);
		log.info("Enter the appointment time ............!!!");

	}
	
	
	public void clickonSaveChangesbutton() {

		driver.findElement(By.xpath("//span[contains(text(),'Save Changes')]")).click();
		log.info("Clicking on SaveChanges button....!!!");
	}
//
//	public void clickonStartTime() {
//
//		driver.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
//
//	}


	public void makeAppointment(String strtime_interval,String strenterstarttime,String strenterendtime) {

		this.clickOnDashboard();
		this.clickOnCalender();
		this.clickOnTimeSlot();
		this.selectDate();
		this.ClickOnAddSlot();
		this.ClickOnConsulttypeDropdown();
		this.SelectOnConsulttype();
		this.StarttimeClick(strenterstarttime);
		this.endtimeClick(strenterendtime);
		//this.clickOncanceltime();
		this.time_Interval(strtime_interval);

		//Clicking on Starttime Calender....!!!
		this.clickonSaveChangesbutton();

		//
		//this.clickonStartTime();


	}


}