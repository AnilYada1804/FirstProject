package com.dbs.designpattern;

import java.util.ArrayList;
import java.util.List;

public class Employees {

	private List<String> empList;

	public Employees() {
		empList = new ArrayList<String>();
	}

	public Employees(List<String> emps) {
		this.empList = emps;
	}

	public void loadData() {
		empList.add("Pankaj");
		empList.add("Ram");
		empList.add("Venkat");
	}

	public List<String> getEmployess() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String emp : this.getEmployess()) {
			temp.add(emp);
		}
		return new Employees(temp);
	}

}
