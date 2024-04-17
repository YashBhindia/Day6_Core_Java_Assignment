package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Yash", 25));
		personList.add(new Person("Ayush", 26));

		Collections.sort(personList);
		System.out.println("Sorted by age:");
		System.out.println(personList);
		
		Collections.sort(personList, Comparator.comparing(Person::getName));
		System.out.println("\nSorted by name:");
		System.out.println(personList);
	}
}
