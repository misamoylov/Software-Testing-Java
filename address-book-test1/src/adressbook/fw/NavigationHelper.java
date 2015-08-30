package adressbook.fw;

import org.openqa.selenium.By;

public class NavigationHelper extends HelperBase {


	public NavigationHelper(ApplicationManager manager) {
		super(manager);
	}

	public void gotoGroups() {
		// go to groups
		click(By.linkText("groups"));
	}

	public void goToHomePage() {
		// go to home page
		click(By.linkText("home page"));
	}

	public void openMainPage() {
		// open main page
		driver.get(manager.baseUrl + "/addressbookv4.1.4/");
	}

}
