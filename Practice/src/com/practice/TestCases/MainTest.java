package com.practice.TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		int res=Main.sample(2, 4);
		assertEquals(6, res); 
	}
	
	@Test
	void test1() {
		Main.sample2();
		assertEquals(0, 0); 
	}


}
