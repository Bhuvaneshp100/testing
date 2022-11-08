package testng;

import org.testng.annotations.Test;
//give priority for test case
//default priority is zero
//lowest priority will execute first,if priority is not given or priorities are same
//execution happen alphabetic order
//we can give negative priority

public class Testcase8 {
	@Test(priority = 0)
	public void a1() {
		System.out.println("hi");
	}
	@Test(priority = 0)
	public void b1() {
		System.out.println("hello");
	}	
	@Test(priority = 0)
	public void c1() {
		System.out.println("hey");
	}
}



