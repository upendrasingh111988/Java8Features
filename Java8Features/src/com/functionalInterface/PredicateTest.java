package com.functionalInterface;

public class PredicateTest {

	public static void main(String[] args) {
		
		Predicate<Integer> predicate=(t)->{
			
			if(t%2==0) {
				return true;
				
			}else {
				return false;
			}
		};
		
		System.out.println(predicate.test(10));

	}

}
