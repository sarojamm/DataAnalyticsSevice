package test.data.analytics;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {
	//Arrays.sort

	@Test
	public void testArraySort() {
		int [] numbers = {12, 3, 4 ,1};
		int [] expected ={1, 3, 4, 12};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	@Test(expected=NullPointerException.class)
    public void testArraySortNullArray() {
    	int[] numbers = null;
    	Arrays.sort(numbers);
    }
     
    @Test(timeout=100)
    public void testSortPerformance() {
    	int[] numbers = {12, 23,4};
    	for(int i =1; i < 1000000 ; i++)
    	{
    		numbers[0]=i;
    		Arrays.sort(numbers);
    	}
		}
}
