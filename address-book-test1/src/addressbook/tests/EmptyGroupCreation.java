package addressbook.tests;

import org.testng.annotations.Test;

public class EmptyGroupCreation extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getNavigationHelper().gotoGroups();
    app.getGroupHelper().groupCreation();
	app.getGroupHelper().fillGroupForm(new GroupData("","",""));
    app.getGroupHelper().submitButton();
    app.getGroupHelper().returnToGroupPage();
  }

}
