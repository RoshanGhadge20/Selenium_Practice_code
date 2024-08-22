package Amazon_product_Purchase_Flow;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class generate_report
{
	@Test
	public void pass_Test()
	{
		Assert.assertTrue(true);
	
	}
	
	@Test
	public void fail_Test()
	{
		Assert.assertFalse(false);
	}
	
	@Test
	public void skipTest()
	{
		throw new SkipException("Skipping this test ");
	}
}
