package com.functionalInterface;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		
		Function<String, Integer>lengthofname=(name)->name.length();
		
		Integer lenofname = lengthofname.apply("Upendra");
		System.out.println(lenofname);
	}

}
