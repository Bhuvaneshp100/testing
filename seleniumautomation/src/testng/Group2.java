package testng;

import org.testng.annotations.Test;

public class Group2 {
	@Test(groups= {"regration"})
	public void sample3(){
		System.out.println("regration test case");
	}
	@Test(groups= {"smoke"})
	public void sample4(){
		System.out.println("smoke test case");
	}
}
