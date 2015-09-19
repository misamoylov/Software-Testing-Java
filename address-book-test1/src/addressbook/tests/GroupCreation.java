package addressbook.tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GroupCreation extends TestBase {
	
	  @Test(dataProvider = "randomValidGroupGenerator")
	  public void GroupCreationWithValidData(GroupData group) throws Exception {
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

