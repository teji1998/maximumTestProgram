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
	
	public static <E extends Comparable<E> > void printMax(){
		System.out.println("Maximum Integer= " + testingMaximumValue(7, 9, 5, 1));
		System.out.println("Maximum Float= " + testingMaximumValue(3.9f, 2.8f, 1.6f, 2.6f));
		System.out.println("Maximum String= "+ testingMaximumValue("Zebra","Goat", "Cat","Camel"));
	}

	public static void main(String[] args) {
		printMax();
	}
	
}