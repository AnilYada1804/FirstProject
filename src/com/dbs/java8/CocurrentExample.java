package com.dbs.java8;

import java.util.ArrayList;
import java.util.List;

public class CocurrentExample {
	public static void main(String[] args) {
		List myList = new ArrayList<>();
		myList.add("test");
		myList.add("hello");
		List second = myList;
		for(int i = 0; i<myList.size(); i++){
			System.out.println(myList.get(i));
			if(myList.get(i).equals("3")){
				myList.remove(i);
				i--;
				myList.add("6");
			}
		}
		System.out.println(myList.size());
		System.out.println(second.size());

	}

}
