package com.bridgelabz.maximumtest;

public class TestMaximum {
	Integer number1;
	Integer number2;
	Integer number3;

	TestMaximum(Integer number1, Integer number2, Integer number3){
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}

	public Integer numberHavingMaximumValue(){
		Integer maximum = number1;
		if(number2.compareTo(number1) > 0){
			maximum = number2;
		}
		if(number3.compareTo(number2) > 0){
			maximum = number3;
		}
		return maximum;
	}
}
