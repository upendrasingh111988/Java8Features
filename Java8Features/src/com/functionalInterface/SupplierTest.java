package com.functionalInterface;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<LocalDateTime> supplier =()-> LocalDateTime.now();
		LocalDateTime localDateTime = supplier.get();
		System.out.println(localDateTime);

	}

}
