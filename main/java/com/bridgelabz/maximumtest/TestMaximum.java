package com.bridgelabz.maximumtest;
public class TestMaximum < E extends Comparable<E> > {

	E[] values;
	public TestMaximum(E... values){
		this.values = values;
	}

	//Method to check maximum integer, float & string number between three.
	public static <E extends Comparable<E>> E testingMaximumValue (E... values){
		E maximum = values[0];
		for (E element : values) {
			if (element.compareTo(maximum) > 0) {
				maximum = element;
			}
		}
		return maximum;
	}
}