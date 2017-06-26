package testP;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTest {
	@Test(groups = { "slow" })  
	    public void canConstructAPersonWithAName() {  
		 Person person = new Person("Larry");  
		 Assert.assertEquals("Larr", person.getName()); 
	    } 
}
