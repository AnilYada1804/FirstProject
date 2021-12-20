package com.dbs.trickyprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapByValue {
	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();

		scores.put("David", 95);
		scores.put("Jane", 80);
		scores.put("Mary", 97);
		scores.put("Lisa", 78);
		scores.put("Dino", 65);

		System.out.println(scores);

		scores = sortByValue(scores);

		System.out.println(scores);
	}

	private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
		Map<String, Integer> sortByValue = new LinkedHashMap<>();
		Set<Entry<String, Integer>> set = scores.entrySet();
		System.out.println("set: " + set);
		List<Entry<String, Integer>> list = new ArrayList<>(set);
		System.out.println("list " + list);
		list.sort((x, y) -> x.getValue().compareTo(y.getValue()));
		System.out.println("after sorting " + list);

		for (Entry<String, Integer> entry : set) {
			sortByValue.put(entry.getKey(), entry.getValue());
		}
		System.out.println("Linked HashMap " + sortByValue);

		return sortByValue;
	}

}
