package com.examples.S01JunitDemos.tests;

import org.junit.*;
import org.junit.Test;
public class MyFirstTestClass {

	@Before
	public void init() {
		System.out.println("Before each test ");
	}
	@After
	public void after() {
		System.out.println("After each test");
	}
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	@BeforeClass
	public static void beforeclass() {
		System.out.println("Before class");
	}
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3");
	}
	
	@AfterClass
	public static void afterclass() {
		System.out.println("After class");
	}
}
