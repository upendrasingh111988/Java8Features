package com.functionalInterface;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String>consumeName=(t)->System.out.println(t);
		
		consumeName.accept("Aviraj");

	}

}
