package a2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass {
	@Test (priority=1)
	    public void driveCar()
	   {
		  System.out.println("Drive the car");
	   }
	@Test (priority=2)
    public void driveCar2()
   {
	  System.out.println("Drive the car2");
   }
  
	  @BeforeMethod
	  public void startCar() {
		  System.out.println("Start the car");
	  }
	 
	  @AfterMethod
	  public void stopCar() {
		  System.out.println("Stop the car");
	  }
}
