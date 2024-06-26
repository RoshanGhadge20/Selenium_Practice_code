package Amazon_product_Purchase_Flow;

import org.testng.SkipException;
import org.testng.annotations.Test;

import junit.framework.Assert;

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
