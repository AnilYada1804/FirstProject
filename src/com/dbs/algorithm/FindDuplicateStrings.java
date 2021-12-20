package com.dbs.algorithm;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateStrings {
	public static void main(String[] args) {
		String array[] = { "hi", "test", "welcome", "xyz", "hi", "hi", "welcome", "welcome" };
		HashMap<String, Integer> map = new HashMap<>();
		for (String str : array) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
		System.out.println(map);
		
		for(Entry<String,Integer> entry: map.entrySet()) {
			if(entry.getValue() >1) {
				System.out.println(entry.getKey()+"--"+entry.getValue());
			}
		}
		System.out.println("--------------");
		List<Integer> numbersList = map.values().stream().sorted().collect(Collectors.toList());
		int maxValue = map.entrySet().stream().mapToInt(Map.Entry::getValue).max().getAsInt();
		int num =map.entrySet().stream().mapToInt(Map.Entry::getValue).max().getAsInt();
		
//		int highest = numbersList.get(numbersList.size() - 1);
		map.entrySet().forEach(entry -> {
			if (entry.getValue().equals(maxValue)) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		});
		Set<String> set = new LinkedHashSet<>();
		for(String str: array) {
			set.add(str);
		}
		Object[] output = set.stream().toArray();
		System.out.println("------------"+set);
		for(Object obj :output) {
			System.out.print(obj);
		}
	}

}
