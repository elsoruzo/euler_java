package com.euler1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplesTest {

	@Test
	void test() {
		MultiplesOf3And5 multiplayer = new MultiplesOf3And5();
        int result = multiplayer.GetMultiples();
		// assert statements
        assertEquals(233168, result, "The sum of multiples of 3 or 5 up to 1000 should be 233168");

	}

}


