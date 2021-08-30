package test;



import org.testng.annotations.Test;

import pages.TestBase;
import pages.AdminRole;
import pages.AdminSupport;
import pages.AdminLogin;

public class admintest extends TestBase {

	AdminLogin objLogin;
	AdminRole objRole;
	AdminSupport objsupport;
	

	@Test(priority=1)
	public void test_adminpage() {


		//Create Login Pageo bject
		objLogin = new AdminLogin(driver);

		//Login to Application
		objLogin.loggingtoPage(prop.getProperty("uname1"),prop.getProperty("pwd1"));
		System.out.println("Admin Entering a Valid EmailId ");
		System.out.println("Admin Entering a Valid Password");

	}
	
	@Test(priority=2)
	public void test_admindashboard() {
		
		objRole = new AdminRole(driver);
		
		objRole.CreatingRole();
		
		
	}
	
	
	@Test(priority=3)
	public void test_adminsupport() {
		
		objsupport = new AdminSupport(driver);
		
		objsupport.submit(prop.getProperty("Username"), prop.getProperty("supportEmail"), prop.getProperty("PhoneNo"), prop.getProperty("supportPassword"));
		
		System.out.println("Entering Support username");
		System.out.println("Entering Support Email");
		System.out.println("Entering Support PhoneNo");
		System.out.println("Entering Support password");
		
		
	}
	
	

}
