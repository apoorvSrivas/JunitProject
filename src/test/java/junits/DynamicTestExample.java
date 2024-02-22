package junits;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import code.StringFunctions;

public class DynamicTestExample {    
	
	@TestFactory
	public Collection<DynamicTest> method1() {  //  If we want to create many test methods using 1 single method, then we use this way
		
		return Arrays.asList(
				
				DynamicTest.dynamicTest("Positive test", 
						()-> Assertions.assertTrue(StringFunctions.isPalindrome("Madam"))),
				DynamicTest.dynamicTest("Negative test", 
						()-> Assertions.assertTrue(StringFunctions.isPalindrome("Apoorv"))),
				DynamicTest.dynamicTest("Negative test", 
						()-> Assertions.assertTrue(StringFunctions.isPalindrome("Vedika")))
				
			);
		
	}
}
