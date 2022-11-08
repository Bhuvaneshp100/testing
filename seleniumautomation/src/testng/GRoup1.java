package testng;

import org.testng.annotations.Test;

public class GRoup1 {

	@Test(groups= {"smoke"})
	public void sample1(){
		System.out.println("smok test case");
	}
	@Test(groups= {"regration"})
	public void sample2(){
		System.out.println("rigration test case");
	}
}


