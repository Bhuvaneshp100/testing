package testng;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertss {

	@Test
	public void hardassert() {
		String actualtittle="qspider";
		String expectedtittle="qspider";
	Assert.assertEquals(actualtittle, expectedtittle);
	}

}
