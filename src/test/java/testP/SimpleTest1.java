package testP;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleTest1 {
	   @BeforeClass  
	    public void setUp() {  
	        System.out.println("setUp");  
	    }  
	  
	    @Test(groups = { "slow" })  
	    public void aSlowTest1() {  
	        System.out.println("slow test1");  
	    }  
	  
	    @Test(groups = { "fast" })  
	    public void aFastTest1() {  
	        System.out.println("fast test1");  
	    }  
	} 