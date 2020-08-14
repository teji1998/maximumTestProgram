package com.bridgelabz.maximumtest;

public class TestMaximum {

	public Integer numberHavingMaximumValue(Integer number1, Integer number2, Integer number3){
		Integer maximum = number1;
		if(number2.compareTo(number1) > 0){
			maximum = number2;
		}
		if(number3.compareTo(number2) > 0){
			maximum = number3;
		}
		return maximum;
	}

	public Float floatNumberHavingMaximumValue(Float floatNumber1, Float floatNumber2, Float floatNumber3){
		Float maximum = floatNumber1;
		if(floatNumber2.compareTo(floatNumber1) > 0){
			maximum = floatNumber2;
		}
		if(floatNumber3.compareTo(floatNumber2) > 0){
			maximum = floatNumber3;
		}
		return maximum;
	}
}

