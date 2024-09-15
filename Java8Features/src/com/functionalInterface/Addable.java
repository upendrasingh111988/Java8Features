package com.functionalInterface;

public interface Addable {
	
	int add(int a , int b);
	
	default int sum(int a , int b , int c) {
		
		return a+b+c;
	}
	public static void msg() {
		
		System.out.println("testing functional interface::");
	}

}
