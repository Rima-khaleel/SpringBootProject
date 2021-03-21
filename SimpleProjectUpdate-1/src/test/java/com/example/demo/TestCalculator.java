package com.example.demo;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestCalculator {

	Calculator service = mock(Calculator.class);

	@Test
	void testAdd() {
		System.out.println("add");

		double first = 3;
		double second = 4;
		double expectedResult = first + second;
		when(service.add(first, second)).thenReturn(expectedResult);

		assertEquals(service.add(first, second), expectedResult);
	}

}
