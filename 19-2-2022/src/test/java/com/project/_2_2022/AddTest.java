package com.project._2_2022;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void Addtest() {
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.add(24, 56);
		assertEquals(80,result);
		
	}

}
