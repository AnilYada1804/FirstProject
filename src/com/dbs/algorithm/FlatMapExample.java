package com.dbs.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		List evens = Arrays.asList(2, 4, 6);
		List odds = Arrays.asList(3, 5, 7);
		List primes = Arrays.asList(2, 3, 5, 7, 11);

		List numbers = (List) Stream.of(evens, odds, primes).flatMap(fMap -> fMap.stream())
				.collect(Collectors.toList());
		System.out.println(numbers);
		int numbs[] = {2,4,5};
		int sum =Arrays.stream(numbs).reduce(0, (a, b) -> a + b);
		System.out.println("sum: "+sum);
		int max = Arrays.stream(numbs).reduce(0, Integer::max);
		System.out.println("max: "+max);
		reverseString();
		Map<Object, Object> map = new HashMap<>();
		map.put(null, "t1");
		map.put(null, "t2");
		
		//flatMap
		String arr[][] = new String[][]{{"a", "b"},{"c", "d"},{"e", "f"}};
		String result[] =Stream.of(arr).flatMap(Stream::of).toArray(String[]::new);
		Stream.of(evens, odds).flatMap(x ->x.stream()).collect(Collectors.toList());
		Arrays.stream(numbs).reduce(0, (a,b) -> a+b);
		System.out.println("-----------null map: "+map.get(null));
		Thread th = new Thread(new Runnable() {
			public void run() {
				
			}
		});
		new Thread(() -> System.out.println("Hello")).start();;

	}

	private static void reverseString() {
		String s = "Hellow";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
		int a = 20, b = 30;
//		int a = a+b; //50
//		int b= a-b; // 20
//		int a = a-b; //30

		char chararray[] = s.toCharArray();
		for (int i = chararray.length - 1; i >= 0; i--) {
			System.out.print(chararray[i]);
		}
	}

}
