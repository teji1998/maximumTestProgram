package com.bridgelabz.maximumtest;

public class TestMaximum<E extends Comparable <E>> {
	E value1,value2, value3;

	TestMaximum(E value1, E value2, E value3) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}

	public E testMaximum() {
		return inputHavingMaximumValue(value1, value2, value3);
	}

	public static <E extends Comparable> E inputHavingMaximumValue( E value1, E value2 ,E value3){
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


