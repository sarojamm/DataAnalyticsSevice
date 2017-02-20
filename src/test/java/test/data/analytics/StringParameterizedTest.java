package test.data.analytics;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import data.analytics.practice.StringHelper;
@RunWith(Parameterized.class)
public class StringParameterizedTest {

	private String input;
	private String expectedOutput;
	StringHelper sh = new StringHelper();
	public StringParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs [][] ={{"AACD","CD"},{"ACD","CD"}};
		return Arrays.asList(expectedOutputs);
	}
    @Test
    public void testTruncateAInFirst2Positions(){
    	assertEquals(expectedOutput,sh.truncateAInFirst2Positions(input));
    }
}
