package com.masai;

public class Main {

	public static void main(String[] args) {

		Box<Integer> intBox = new Box<>();
		intBox.set(5);
		int intValue = intBox.get();
		System.out.println("integer value in box: " + intValue);

		Box<String> strBox = new Box<>();
		strBox.set("Hello, World!");
		String strValue = strBox.get();
		System.out.println("String value in box: " + strValue);
	}
}
