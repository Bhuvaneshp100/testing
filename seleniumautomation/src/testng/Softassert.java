package testng;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Softassert {
	@Test
	public void softassestt() {
		String actualtittle="qspider";
		String expectedtittle="qspider";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualtittle, expectedtittle);

	}
	
	
}
