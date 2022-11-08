package testng;

import org.testng.annotations.Test;

public class TEstcase9 {
	@Test(enabled = false)
	public void a1() {
		System.out.println("hi");
	}
	@Test(invocationCount = 0)
	public void b1() {
		System.out.println("hello");
	}	
	@Test()
	public void c1() {
		System.out.println("hey");
	}
	

}
