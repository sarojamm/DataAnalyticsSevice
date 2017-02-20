package test.data.analytics;
import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {

	@Test
	public void testMultiply() {
		  MyClass tester = new MyClass(); // MyClass is tested

        assertEquals("10 x 0 must be 0", 60, tester.multiply(10, 6));
        assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
        assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
 
	}

}
