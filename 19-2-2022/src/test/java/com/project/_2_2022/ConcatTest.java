package com.project._2_2022;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void Concattest() {
		MyJUnitClass junit = new MyJUnitClass();
		String result = junit.concat("Hello" ," World" );
		assertEquals("Hello World",result);		
		
	}

}
