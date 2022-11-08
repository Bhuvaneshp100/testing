package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase11 {
	@Test()
	public void login() {
		System.out.println("testcase");
		Reporter.log("it is report the class");
		Reporter.log("test case id 0001", true);
	}

}
