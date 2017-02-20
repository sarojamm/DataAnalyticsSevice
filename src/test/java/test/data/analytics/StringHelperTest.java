package test.data.analytics;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import data.analytics.practice.StringHelper;

public class StringHelperTest {
	@BeforeClass
	public static void beforeClssSetup(){ 
		//like db connections
		System.out.println("Before class test");
	}
	@AfterClass
	public static void afrerClssSetup(){ 
		//like db connections
		System.out.println("After class test");
	}
	
	@Before
	public void setup(){
		System.out.println("Before test");
	}
	@Test
	public void testTruncateAInFirst2Positions() {
		StringHelper sh = new StringHelper();
		String expected = "CD";
		assertEquals(expected, sh.truncateAInFirst2Positions("AACD"));
		assertEquals(expected, sh.truncateAInFirst2Positions("ACD"));
	}

//	@Test
//	public void testAreFirstAndLastTwoCharactersTheSame() {
//		fail("Not yet implemented");
//	}

}
