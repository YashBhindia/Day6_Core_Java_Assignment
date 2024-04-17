package com.masai;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	private static void serializeToFile(List<Student> students, String fileName) {
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
			outputStream.writeObject(students);
			System.out.println("Serialization completed successfully.");
		} catch (IOException e) {
			System.err.println("Error occurred during serialization: " + e.getMessage());
		}
	}

	private static List<Student> deserializeFromFile(String fileName) {
		List<Student> students = new ArrayList<>();
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
			students = (List<Student>) inputStream.readObject();
			System.out.println("Deserialization completed successfully.");
		} catch (IOException | ClassNotFoundException e) {
			System.err.println("Error occurred during deserialization: " + e.getMessage());
		}
		return students;
	}

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students.add(new Student("Yash", 1));
		students.add(new Student("Ayush", 2));
		students.add(new Student("Radhika", 3));

		serializeToFile(students, "students.ser");

		List<Student> st = deserializeFromFile("students.ser");

		for (Student student : st) {
			System.out.println(student);
		}
	}
}
