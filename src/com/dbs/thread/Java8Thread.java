package com.dbs.thread;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java8Thread {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread is started");
				
			}
		}).start();
		
		//Java8
		new Thread(() -> System.out.println("Java 8 Thread started")).start();
		new Thread(() -> System.out.println("Test")).start();
		List<Integer> list = Arrays.asList(1,3,2);
		int total =list.stream().reduce(0, (a,b) -> (a+b));
		System.out.println(total);
		list.stream().reduce(0, Integer::sum);
		
		 // Creating a List of Strings
        List<String> list1 = Arrays.asList("Geeks", "GFG",
                                 "GeeksforGeeks", "gfg");
        list1.stream().flatMap(x ->Stream.of(x.charAt(2))).forEach(System.out::println);
        
//        List<Integer> listofInts  = list.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
  
	}

}
