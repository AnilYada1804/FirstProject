package com.dbs.designpattern;

import java.util.List;

public class PrototypeDPattern {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmployess();
		list.add("John");
		List<String> list1 = empsNew1.getEmployess();
		list1.remove("Pankaj");
		
		System.out.println("emps List: "+emps.getEmployess());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);

	}

}

