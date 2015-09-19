package addressbook.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import static org.testng.Assert.assertEquals;
public class NonEmptyGroupCreation extends TestBase {
	
	@DataProvider	
	public Iterator<Object[]> randomValidGroupGenerator(){
		List<Object[]> list = new ArrayList<Object[]>();
		for (int i = 0; i < 5; i++){
			GroupData group = new GroupData();
			group.name = generateRandomString();
			group.header = generateRandomString();
			group.footer = generateRandomString();
			list.add(new Object[]{group});
		}
		return list.iterator();
	}
	
	public String generateRandomString() {
		Random rnd = new Random();
		if (rnd.nextInt(3) == 0){
			return "";
		}
		else {
			return "test" + rnd.nextInt();
		}
	}
  @Test(dataProvider = "randomValidGroupGenerator")
  public void testNonEmptyGroupCreation(GroupData group) throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getNavigationHelper().gotoGroups();
	// save old state
	List<GroupData> oldList = app.getGroupHelper().getGroups();
	//actions
    app.getGroupHelper().groupCreation();
	app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitButton();
    app.getGroupHelper().returnToGroupPage();
    //save new state
    List<GroupData> newList = app.getGroupHelper().getGroups();
    //compare states
    oldList.add(group);
    Collections.sort(oldList);
    assertEquals(newList, oldList);
  }
}
