package testng;

import org.testng.annotations.Test;
//creating dependency between test case
//failure of one test case may lead to skipped  of dependent test case
public class Testcase12 {

	@Test()
	public void login() {
		System.out.println("hi");
		throw new ArithmeticException();
	}
	@Test(dependsOnMethods = "login")
	public void cart() {
		System.out.println("hello");
	}	
	@Test(dependsOnMethods = "cart")
	public void logout() {
		System.out.println("hey");
	}
	}


