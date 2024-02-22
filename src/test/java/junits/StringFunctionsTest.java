package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import code.StringFunctions;

public class StringFunctionsTest {    // Here we're writing testcases for StringFunctions class functions. 
	
	@Test
	@Tag("Regression")
	public void tes1() {
		
		String str="apoorv";
		boolean result= StringFunctions.isPalindrome(str);
		Assertions.assertFalse(result);
		
	}
	
	
	@Test
	public void tes2() {
		
		Assertions.assertTrue(StringFunctions.isPalindrome("madam"));
	}

}
