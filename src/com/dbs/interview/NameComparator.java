package com.dbs.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameComparator {

	public static void main(String[] args) {
		StudentComparator sc = new StudentComparator();
		sc.setAge(21);
		sc.setName("Anil");
		sc.setRollNo("123A");
		StudentComparator sc1 = new StudentComparator();
		sc1.setAge(20);
		sc1.setName("Sadhu Anil");
		sc1.setRollNo("123A");
		List<StudentComparator> sList = new ArrayList<>();
		sList.add(sc);
		sList.add(sc1);
		Collections.sort(sList);
		for(StudentComparator s: sList) {
			System.out.println(s.getAge()+" - "+s.getName());
		}
		
	}
}

class StudentComparator implements Comparable<StudentComparator> {
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

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	String name;
	String rollNo;

	@Override
	public int compareTo(StudentComparator s1) {
		if (age == s1.age) {
			return 0;
		} else if (age > s1.age) {
			return 1;
		} else {
			return -1;
		}
	}
}
