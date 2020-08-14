package com.bridgelabz.maximumtest;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {
	//Maximum Value At First Position
	@Test
	public void Maximum_Value_At_First_Position() {
		TestMaximum maximumNumber = new TestMaximum(9, 7, 5);
		int maximum = maximumNumber.numberHavingMaximumValue();
		Assert.assertEquals(9, maximum);
	}

	//Maximum Value At Second Position
	@Test
	public void Maximum_Value_At_Second_Position() {
		TestMaximum maximumNumber = new TestMaximum(7, 9, 5);
		int maximum = maximumNumber.numberHavingMaximumValue();
		Assert.assertEquals(9, maximum);
	}

	//Maximum Value At Third Position
	@Test
	public void Maximum_Value_At_Third_Position() {
		TestMaximum maximumNumber = new TestMaximum(7, 5, 9);
		int maximum = maximumNumber.numberHavingMaximumValue();
		Assert.assertEquals(9, maximum);
	}
}

