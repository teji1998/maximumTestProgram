package com.bridgelabz.maximumtest;

public class TestMaximum {
	public <E extends Comparable> E inputHavingMaximumValue(E value1, E value2, E value3){
		E maximum = value1;
		if(value2.compareTo(maximum) > 0){
			maximum = value2;
		}
		if(value3.compareTo(maximum) > 0){
			maximum = value3;
		}
		return maximum;
	}
}


