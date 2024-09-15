package com.functionalInterface;

public class Main {

	public static void main(String[] args) {
		Addable addnumbers=(a,b)->a+b;
		
		int sumOfTwonumbers = addnumbers.add(10, 15);
		System.out.println("Sum of Two numbers::"+ sumOfTwonumbers);
		
		int defaultMethodResult = addnumbers.sum(10, 30, 60);
		System.out.println("Sum of three numbers::"+ defaultMethodResult);
		
		Addable.msg();

	}

}
