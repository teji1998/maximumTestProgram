package com.bridgelabz.maximumtest;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {

	//Maximum Value At First Position
	@Test
	public void givenAnInteger_whenMaximumAtFirstPosition_shouldReturnFirstPosition() {
		TestMaximum maximumNumber = new TestMaximum();
		int maximum = (int) maximumNumber.testingMaximumValue(9, 7, 1, 5);
		Assert.assertEquals(9, maximum);
	}

	//Maximum Value At Second Position
	@Test
	public void givenAnInteger_whenMaximumAtSecondPosition_shouldReturnSecondPosition() {
		TestMaximum maximumNumber = new TestMaximum();
		int maximum = (int) maximumNumber.testingMaximumValue(7, 9, 5, 1);
		Assert.assertEquals(9, maximum);
	}

	//Maximum Value At Third Position
	@Test
	public void givenAnInteger_whenMaximumAtThirdPosition_shouldReturnThirdPosition() {
		TestMaximum maximumNumber = new TestMaximum();
		int maximum = (int) maximumNumber.testingMaximumValue(7, 5, 9, 1);
		Assert.assertEquals(9, maximum);
	}

	//Maximum Value At Fourth Position
	@Test
	public void givenAnInteger_whenMaximumAtFourthPosition_shouldReturnFourthPosition() {
		TestMaximum maximumNumber = new TestMaximum();
		int maximum = (int) maximumNumber.testingMaximumValue(1, 7, 5, 9);
		Assert.assertEquals(9, maximum);
	}

	//Maximum Float Value At First Position
	@Test
	public void givenAFloat_whenMaximumAtFirstPosition_shouldReturnFirstPosition() {
		TestMaximum maximumFloatNumber = new TestMaximum();
		float maximum = (float) maximumFloatNumber.testingMaximumValue(3.9f, 2.8f, 1.6f, 2.6f);
		Assert.assertEquals(3.9f, maximum, 0);
	}

	//Maximum Float Value At Second Position
	@Test
	public void givenAFloat_whenMaximumAtSecondPosition_shouldReturnSecondPosition() {
		TestMaximum maximumFloatNumber = new TestMaximum();
		float maximum = (float) maximumFloatNumber.testingMaximumValue(1.6f, 3.9f, 2.6f, 2.8f);
		Assert.assertEquals(3.9f, maximum, 0);
	}

	//Maximum Float Value At Third Position
	@Test
	public void givenAFloat_whenMaximumAtThirdPosition_shouldReturnThirdPosition() {
		TestMaximum maximumFloatNumber = new TestMaximum();
		float maximum = (float) maximumFloatNumber.testingMaximumValue(2.8f, 1.6f, 3.9f, 2.6f);
		Assert.assertEquals(3.9f, maximum, 0);
	}

	//Maximum Float Value At Fourth Position
	@Test
	public void givenAFloat_whenMaximumAtFourthPosition_shouldReturnFourthPosition() {
		TestMaximum maximumFloatNumber = new TestMaximum();
		float maximum = (float) maximumFloatNumber.testingMaximumValue(2.8f, 2.6f, 1.6f, 3.9f);
		Assert.assertEquals(3.9f, maximum, 0);
	}

	//Maximum String Value At First Position
	@Test
	public void givenAString_whenMaximumAtFirstPosition_shouldReturnFirstPosition() {
		TestMaximum maximumString = new TestMaximum();
		String maximum = (String) maximumString.testingMaximumValue("Zebra","Goat", "Cat","Camel");
		Assert.assertEquals("Zebra", maximum);
	}

	//Maximum String Value At Second Position
	@Test
	public void givenAString_whenMaximumAtSecondPosition_shouldReturnSecondPosition() {
		TestMaximum maximumString = new TestMaximum();
		String maximum = (String) maximumString.testingMaximumValue("Goat","Zebra","Cat","Camel");
		Assert.assertEquals("Zebra", maximum);
	}

	//Maximum String Value At Third Position
	@Test
	public void givenAString_whenMaximumAtThirdPosition_shouldReturnThirdPosition() {
		TestMaximum maximumString = new TestMaximum();
		String maximum = (String) maximumString.testingMaximumValue("Cat","Goat","Zebra","Camel");
		Assert.assertEquals("Zebra", maximum);
	}

	//Maximum String Value At Fourth Position
	@Test
	public void givenAString_whenMaximumAtFourthPosition_shouldReturnFourthPosition() {
		TestMaximum maximumString = new TestMaximum();
		String maximum = (String) maximumString.testingMaximumValue("Cat","Goat","Camel","Zebra");
		Assert.assertEquals("Zebra", maximum);
	}
}

