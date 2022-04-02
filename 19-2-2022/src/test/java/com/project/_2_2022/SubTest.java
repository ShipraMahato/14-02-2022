package com.project._2_2022;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubTest {

	@Test
	public void Subtest() {
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.sub(20,5);
		assertEquals(15,result);
		
	}

}
