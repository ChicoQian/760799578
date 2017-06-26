package testP;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleTest {  
    @BeforeClass  
    public void setUp() {  
        System.out.println("setUp");  
    }  
  
    @Test(groups = { "slow" })  
    public void aSlowTest() {  
        System.out.println("slow test");  
    }  
  
    @Test(groups = { "fast" })  
    public void aFastTest() {  
        System.out.println("fast test");  
    }
}
