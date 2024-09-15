package com.functionalInterface;

@FunctionalInterface
public interface Predicate<T> {
	
	boolean test(T t);

}
