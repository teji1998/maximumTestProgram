package com.bridgelabz.maximumtest;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {

	//Maximum Value At First Position
	@Test
	public void Maximum_Value_At_First_Position() {
		TestMaximum maximumNumber = new TestMaximum();
		int maximum = (int) maximumNumber.testingMaximumValue(9, 7, 1, 5);
		Assert.assertEquals(9, maximum);
	}

	//Maximum Value At Second Position
	@Test
	public void Maximum_Value_At_Second_Position() {
		TestMaximum maximumNumber = new TestMaximum();
		int maximum = (int) maximumNumber.testingMaximumValue(7, 9, 5, 1);
		Assert.assertEquals(9, maximum);
	}

	//Maximum Value At Third Position
	@Test
	public void Maximum_Value_At_Third_Position() {
		TestMaximum maximumNumber = new TestMaximum();
		int maximum = (int) maximumNumber.testingMaximumValue(7, 5, 9, 1);
		Assert.assertEquals(9, maximum);
	}

	//Maximum Value At Fourth Position
	@Test
	public void Maximum_Value_At_Fourth_Position() {
		TestMaximum maximumNumber = new TestMaximum();
		int maximum = (int) maximumNumber.testingMaximumValue(1, 7, 5, 9);
		Assert.assertEquals(9, maximum);
	}

	//Maximum Float Value At First Position
	@Test
	public void Maximum_Float_number_At_First_Position() {
		TestMaximum maximumFloatNumber = new TestMaximum();
		float maximum = (float) maximumFloatNumber.testingMaximumValue(3.9f, 2.8f, 1.6f, 2.6f);
		Assert.assertEquals(3.9f, maximum, 0);
	}

	//Maximum Float Value At Second Position
	@Test
	public void Maximum_Float_number_At_Second_Position() {
		TestMaximum maximumFloatNumber = new TestMaximum();
		float maximum = (float) maximumFloatNumber.testingMaximumValue(1.6f, 3.9f, 2.6f, 2.8f);
		Assert.assertEquals(3.9f, maximum, 0);
	}

	//Maximum Float Value At Third Position
	@Test
	public void Maximum_Float_number_At_Third_Position() {
		TestMaximum maximumFloatNumber = new TestMaximum();
		float maximum = (float) maximumFloatNumber.testingMaximumValue(2.8f, 1.6f, 3.9f, 2.6f);
		Assert.assertEquals(3.9f, maximum, 0);
	}

	//Maximum Float Value At Fourth Position
	@Test
	public void Maximum_Float_number_At_Fourth_Position() {
		TestMaximum maximumFloatNumber = new TestMaximum();
		float maximum = (float) maximumFloatNumber.testingMaximumValue(2.8f, 2.6f, 1.6f, 3.9f);
		Assert.assertEquals(3.9f, maximum, 0);
	}

	//Maximum String Value At First Position
	@Test
	public void Maximum_String_At_First_Position() {
		TestMaximum maximumString = new TestMaximum();
		String maximum = (String) maximumString.testingMaximumValue("Zebra","Goat", "Cat","Camel");
		Assert.assertEquals("Zebra", maximum);
	}

	//Maximum String Value At Second Position
	@Test
	public void Maximum_String_At_Second_Position() {
		TestMaximum maximumString = new TestMaximum();
		String maximum = (String) maximumString.testingMaximumValue("Goat","Zebra","Cat","Camel");
		Assert.assertEquals("Zebra", maximum);
	}

	//Maximum String Value At Third Position
	@Test
	public void Maximum_String_At_Third_Position() {
		TestMaximum maximumString = new TestMaximum();
		String maximum = (String) maximumString.testingMaximumValue("Cat","Goat","Zebra","Camel");
		Assert.assertEquals("Zebra", maximum);
	}

	//Maximum String Value At Fourth Position
	@Test
	public void Maximum_String_At_Fourth_Position() {
		TestMaximum maximumString = new TestMaximum();
		String maximum = (String) maximumString.testingMaximumValue("Cat","Goat","Camel","Zebra");
		Assert.assertEquals("Zebra", maximum);
	}
}

