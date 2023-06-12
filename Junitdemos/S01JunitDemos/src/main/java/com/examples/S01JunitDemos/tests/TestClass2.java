package com.examples.S01JunitDemos.tests;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Test;

import com.examples.S01JunitDemos.MathHelper;
public class TestClass2 {

		
	@Test
	public void test1() {

		MathHelper math=new MathHelper();
		assertEquals(53,math.findMax(new int[] {1,2,4,53,23}));
	
	}
	

}
