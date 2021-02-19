package junit_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestArrayUtilities {

	@Test
	public void test1() {
		int[] input = {2,3,4,5};
		int[] expected = {2,5,9,14};
		int[] result = ArrayUtilities.getIntermediateSums(input);
		assertArrayEquals(expected, result);
		
	}

}
