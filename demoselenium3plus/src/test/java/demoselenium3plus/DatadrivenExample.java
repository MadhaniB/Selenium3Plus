package demoselenium3plus;

import org.testng.annotations.Test;

public class DatadrivenExample {

	@Test
	public void testcase(String cname,String cpass)
	{
		System.out.println(cname+ "=========" +cpass);
	}
}
