package addressbook.tests;
import org.testng.annotations.Test;

public class GroupRemovalTests extends TestBase{
	@Test
	public void deleteSomeGroup(){
		app.getNavigationHelper().openMainPage();
		app.getNavigationHelper().gotoGroups();
		app.getGroupHelper().deleteGroup(1);
		app.getGroupHelper().returnToGroupPage();
	}
	

}