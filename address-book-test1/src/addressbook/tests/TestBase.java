package addressbook.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import adressbook.fw.ApplicationManager;
public class TestBase {

	protected static ApplicationManager app;

	@BeforeTest
	public void setUp() throws Exception {
		 app = new ApplicationManager(); 

	  }
	
	@AfterTest
	public void tearDown() throws Exception {
		app.stop();
	  }

}
