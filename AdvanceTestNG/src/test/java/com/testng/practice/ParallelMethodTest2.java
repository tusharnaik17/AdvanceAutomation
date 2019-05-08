package com.testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParallelMethodTest2 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before - class.."+ getClass().getName());
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before - method..");
	}

	@Test
	public void testMethodsOne() {
		System.out.println("Test case 1");
	}

	@Test
	public void testMethodsTwo() {
		System.out.println("Test case 2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After - method..");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After - class ..."+ getClass().getName());
	}

}
