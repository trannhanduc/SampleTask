package JavaSampleTask;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import JavaSampleTask.webservices.AddService;;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebServiceApplicationTests {


	@Test(expected = NumberFormatException.class)
	public void inputIsNull() {
		int input = Integer.parseInt(AddService.AddServiceFunc(""));
		int expect = 0;
		assertEquals(input, expect);
	}
	
	@Test(expected = NumberFormatException.class)
	public void inputIsNotInt() {
		int input = Integer.parseInt(AddService.AddServiceFunc("1,a"));
		int expect = 3;
		assertEquals(input, expect);
	}
	
	@Test(expected = NumberFormatException.class)
	public void inputIsNotInt1() {
		int input = Integer.parseInt(AddService.AddServiceFunc(" ,a"));
		int expect = 3;
		assertEquals(input, expect);
	}
	
	@Test
	public void inputHave2Int() {
		
		int input = Integer.parseInt(AddService.AddServiceFunc("1,2"));
		int expect = 3;
		assertEquals(input, expect);
	}
	
	@Test
	public void inputHave5Int() {
		
		int input = Integer.parseInt(AddService.AddServiceFunc("1,2,3,4,5"));
		int expect = 15;
		assertEquals(input, expect);
	}
	
	@Test
	public void inputHaveNegativeInt() {
		
		int input = Integer.parseInt(AddService.AddServiceFunc("-1,-2,3,5"));
		int expect = 5;
		assertEquals(input, expect);
	}
	


}
