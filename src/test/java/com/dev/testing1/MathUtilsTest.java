package com.dev.testing1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("MathUtils Test Suite")
public class MathUtilsTest {

	MathUtils mathUtils = new MathUtils();
	
	@Nested
	@DisplayName("Tests for Math Operations")
	@Tag("unit")
	class MathTests {

		@ParameterizedTest
		@ValueSource(ints = {2, 4, 6})
		@DisplayName("Should return correct addition with param")
		void testAddNumbersParam(int nums) {
			assertEquals(nums+3, mathUtils.add(nums,3));
			assertEquals(nums+4, mathUtils.add(nums,4));
			assertEquals(nums+37, mathUtils.add(nums,37));
			assertEquals(nums+21, mathUtils.add(nums,21));
			assertEquals(nums+nums, mathUtils.add(nums,nums));
		}
		
		@Test
		@DisplayName("Should return correct addition")
		void testAddNumbers() {
			assertEquals(5, mathUtils.add(2,3));
			assertEquals(8, mathUtils.add(5,3));
			assertEquals(45, mathUtils.add(8,37));
			assertEquals(23, mathUtils.add(2,21));
			assertEquals(9, mathUtils.add(7,2));
		}

		@Test
		@DisplayName("Should return correct multiplication")
		void testOddNumbers() {
			assertEquals(6, mathUtils.multiply(2,3));
			assertEquals(36, mathUtils.multiply(6,6));
			assertEquals(54, mathUtils.multiply(6,9));
		}
		@ParameterizedTest
		@ValueSource(ints = {5, 7, 9})
		@DisplayName("Should return correct multiplication with param")
		void testMultiplyNumbersParam(int nums) {
		    assertEquals(nums * 2, mathUtils.multiply(nums, 2));
		    assertEquals(nums * 5, mathUtils.multiply(nums, 5));
		    assertEquals(nums * 12, mathUtils.multiply(nums, 12));
		    assertEquals(nums * 20, mathUtils.multiply(nums, 20));
		    assertEquals(nums * nums, mathUtils.multiply(nums, nums));
		}

		
		@Test
		@DisplayName("Should return correct division")
		void testDivideNumbers() {
			assertEquals(2, mathUtils.divide(6,3));
			assertEquals(2.5, mathUtils.divide(5,2));
			assertEquals(4, mathUtils.divide(8,2));
			assertEquals(6, mathUtils.divide(36,6));
			assertThrows(ArithmeticException.class, ()->mathUtils.divide(7,0));
		}
		@ParameterizedTest
		@ValueSource(doubles = {10, 20, 30})
		@DisplayName("Should return correct division with param")
		void testDivideNumbersParam(double nums) {
		    assertEquals(nums / 2.0, mathUtils.divide(nums, 2));
		    assertEquals(nums / 5.0, mathUtils.divide(nums, 5));
		    assertEquals(nums / 10.0, mathUtils.divide(nums, 10));
		    assertEquals(nums / 25.0, mathUtils.divide(nums, 25));
		    assertEquals(nums / (double) nums, mathUtils.divide(nums, nums));
			assertThrows(ArithmeticException.class, ()->mathUtils.divide(nums,0));
		}

	}
}
