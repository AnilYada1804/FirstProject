package com.dbs.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AgeComparator implements Comparator<StudentAgeComparator> {
	public int compare(StudentAgeComparator s1, StudentAgeComparator s2) {
		if (s1.age == s2.age) {
			return 0;
		} else if (s1.age > s2.age) {
			return 1;
		} else {
			return -1;
		}
	}

}

class TestComparator {
	public static void main(String[] args) {
		StudentAgeComparator st = new StudentAgeComparator(26, "Mitul", "NCC Urban One");
		StudentAgeComparator st1 = new StudentAgeComparator(25, "Raj", "My Home");
		StudentAgeComparator st2 = new StudentAgeComparator(21, "Venkat", "NCC Urban One");
		StudentAgeComparator st3 = new StudentAgeComparator(20, "Manas", "My Home");

		List<StudentAgeComparator> students = new ArrayList<StudentAgeComparator>();
		students.add(st);
		students.add(st1);
		students.add(st2);
		students.add(st3);
		System.out.println("-------------List Insert order-----------------");
		for (StudentAgeComparator student : students) {
			System.out.println(student.age + " - " + student.getName() + " - " + student.getAddress());
		}

		List<StudentAgeComparator> studentsLinkedList = new LinkedList<StudentAgeComparator>();
		studentsLinkedList.add(st);
		studentsLinkedList.add(st1);
		studentsLinkedList.add(st2);
		studentsLinkedList.add(st3);
		System.out.println("-------------LinkedList Insert order-----------------");
		for (StudentAgeComparator student : studentsLinkedList) {
			System.out.println(student.age + " - " + student.getName() + " - " + student.getAddress());
		}

//		Set<StudentAgeComparator> studentsLinkedSet = new TreeSet<StudentAgeComparator>();
//		studentsLinkedSet.add(st);
//		studentsLinkedSet.add(st3);
//		studentsLinkedSet.add(st1);
//		studentsLinkedSet.add(st2);
//		System.out.println("-------------Treeset Insert order-----------------");
//		for (StudentAgeComparator student : studentsLinkedList) {
//			System.out.println(student.age + " - " + student.getName() + " - " + student.getAddress());
//		}

		System.out.println("-------------Set Random Order-----------------");
		Set<StudentAgeComparator> studentsset = new HashSet<StudentAgeComparator>();
		studentsset.add(st);
		studentsset.add(st1);
		studentsset.add(st2);
		studentsset.add(st3);
		for (StudentAgeComparator student : studentsset) {
			System.out.println(student.age + " - " + student.getName() + " - " + student.getAddress());
		}
		System.out.println("------------sorting Order------------------");
		Collections.sort(students, new AgeComparator());
		for (StudentAgeComparator student : students) {
			System.out.println(student.age + " - " + student.getName() + " - " + student.getAddress());
		}
		
		System.out.println("---------Java8---------"+(students.stream().sorted()));
//		students.stream().sorted(Comparator.comparing(StudentAgeComparator::getAge).thenComparing(StudentAgeComparator::getName))
		students.stream().sorted(Comparator.comparing(StudentAgeComparator::getAge).thenComparing(StudentAgeComparator::getName)).collect(Collectors.toList());
		for (StudentAgeComparator student : students) {
			System.out.println(student.age + " - " + student.getName() + " - " + student.getAddress());
		}
		
	}
}

class StudentAgeComparator {

	StudentAgeComparator(int age, String name, String address) {
		this.address = address;
		this.age = age;
		this.name = name;
	}

	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	String name;
	String address;

}