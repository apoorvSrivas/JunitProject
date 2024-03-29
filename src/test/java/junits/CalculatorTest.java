package junits;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;

import code.Calculator;

public class CalculatorTest {
	
	@DisplayName("Two positive num test")
	@Test
	public void test1() {
		
		int result = Calculator.add(4, 5);
		
		Assertions.assertEquals(9 ,result);
		
	}
	
	 
//	@Disabled
	@Tag("Sanity")
	@DisplayName("One positive num and one negative num test")
	@Test
	public void test2() {
		
		int result = Calculator.add(-4, 5);
		Assertions.assertEquals(1,result);
	}

	
	@RepeatedTest(3)           // This test will repeat 3 times. You can remove @Test from @RepeatedTest test method
	@DisplayName("Two positive num test where result is not matching")
	public void test3() {
		
		
		int result = Calculator.add(4, 5); 
		Assertions.assertNotEquals(10,result);
	}
	
	
	@CustomAnnotation
	public void test4() {
		
		
		int result = Calculator.add(4, 5);
		Assertions.assertNotEquals(10,result);
	}
}
