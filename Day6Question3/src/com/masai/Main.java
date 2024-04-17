package com.masai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("Yash");
		str.add("radhika");
		str.add("ayush");
		str.add("simmi");

		
		System.out.println("Original List: " + str);

		List<String> newList = str.stream().filter(s -> s.length() >= 4) 
				
				.map(String::toUpperCase) 
				.collect(Collectors.toList());

		
		System.out.println("New List: " + newList);
	}
}
