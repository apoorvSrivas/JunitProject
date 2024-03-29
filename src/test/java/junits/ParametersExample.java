package junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import code.StringFunctions;


public class ParametersExample {
	
	
	@ParameterizedTest
    @ValueSource(strings = {"madam", "dad", "radar", "nayan"})
    public void test1(String value) {
    	
    	Assertions.assertTrue(StringFunctions.isPalindrome(value));
    }
	
	
	@ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8})
    public void test2(int num) {
    	
    	Assertions.assertTrue(num%2==0);
    }
}
