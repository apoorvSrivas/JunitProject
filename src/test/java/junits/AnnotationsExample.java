package junits;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import code.Calculator;

public class AnnotationsExample {
	
	
	@BeforeAll      // Runs only once before all
	public static void beforeall() {    // Static is mandatory here. 
		
		System.out.println("Before all.");
	}
	
	
	@BeforeEach                    // It's like testng's @BeforeMethod
	public void beforejunit() {
		
		System.out.println("Before Junit.");
	}
	
	
	@Test
	public void test1() {
		
		int result = Calculator.add(4, 5);
		Assertions.assertEquals(9 ,result);
	}
	
	
	@Test
	public void test2() {
		
		int result = Calculator.add(5, 5);
		
		Assertions.assertEquals(10 ,result);
		
	}
	
	
	@AfterEach
    public void afterjunit() {
		
    	System.out.println("After Junit.");
	}
	
	
	@AfterAll
	public static void afterall() {
		
		System.out.println("After all.");
	}

}
