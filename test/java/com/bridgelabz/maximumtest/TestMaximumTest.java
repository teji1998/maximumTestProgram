package com.bridgelabz.maximumtest;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {

	//Maximum Value At First Position
	@Test
	public void Maximum_Value_At_First_Position() {
		TestMaximum maximumNumber = new TestMaximum(9, 7, 5);
		int maximum = (int) maximumNumber.testMaximum();
		Assert.assertEquals(9, maximum);
	}

	//Maximum Value At Second Position
	@Test
	public void Maximum_Value_At_Second_Position() {
		TestMaximum maximumNumber = new TestMaximum(7, 9, 5);
		int maximum = (int) maximumNumber.testMaximum();
		Assert.assertEquals(9, maximum);
	}

	//Maximum Value At Third Position
	@Test
	public void Maximum_Value_At_Third_Position() {
		TestMaximum maximumNumber = new TestMaximum(7, 5, 9);
		int maximum = (int) maximumNumber.testMaximum();
		Assert.assertEquals(9, maximum);
	}

	//Maximum Float Value At First Position
	@Test
	public void Maximum_Float_number_At_First_Position() {
		TestMaximum maximumFloatNumber = new TestMaximum(3.9f, 2.8f, 1.6f);
		float maximum = (float) maximumFloatNumber.testMaximum();
		Assert.assertEquals(3.9f, maximum, 0);
	}

	//Maximum Float Value At Second Position
	@Test
	public void Maximum_Float_number_At_Second_Position() {
		TestMaximum maximumFloatNumber = new TestMaximum(1.6f, 3.9f, 2.8f);
		float maximum = (float) maximumFloatNumber.testMaximum();
		Assert.assertEquals(3.9f, maximum, 0);
	}

	//Maximum Float Value At Third Position
	@Test
	public void Maximum_Float_number_At_Third_Position() {
		TestMaximum maximumFloatNumber = new TestMaximum(2.8f, 1.6f, 3.9f);
		float maximum = (float) maximumFloatNumber.testMaximum();
		Assert.assertEquals(3.9f, maximum, 0);
	}

	//Maximum String Value At First Position
	@Test
	public void Maximum_String_At_First_Position() {
		TestMaximum maximumString = new TestMaximum("Zebra","Goat", "Cat");
		String maximum = (String) maximumString.testMaximum();
		Assert.assertEquals("Zebra", maximum);
	}

	//Maximum String Value At Second Position
	@Test
	public void Maximum_String_At_Second_Position() {
		TestMaximum maximumString = new TestMaximum("Goat","Zebra","Cat");
		String maximum = (String) maximumString.testMaximum();
		Assert.assertEquals("Zebra", maximum);
	}

	//Maximum String Value At Third Position
	@Test
	public void Maximum_String_At_Third_Position() {
		TestMaximum maximumString = new TestMaximum("Cat","Goat","Zebra");
		String maximum = (String) maximumString.testMaximum();
		Assert.assertEquals("Zebra", maximum);
	}
}


