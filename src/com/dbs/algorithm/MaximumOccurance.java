package com.dbs.algorithm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class MaximumOccurance {
	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 1, 5, 6, 6, 6, 8, 5, 9, 7, 1, 2, 2, 2 };
		// max occurences of an array
		Map<Integer, Integer> map = new HashMap<>();
		int max = 0;
		int chh = 0;
		for (int i = 0; i < a.length; i++) {
			int ch = a[i];
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		} // for
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();

		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				chh = entry.getKey();
			}

		} // for
		OptionalInt num = map.entrySet().stream().mapToInt(Map.Entry::getValue).max();
		List<Integer> keys = map.entrySet().stream().filter(e ->e.getValue().equals(num.getAsInt())).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(keys);
		System.out.println("num " + num.getAsInt());
		for(Entry<Integer, Integer> eI: entrySet) {
			if(eI.getValue() == num.getAsInt()) {
				System.out.println("key: "+eI.getKey()+ "value: "+eI.getValue());
			}
		}
		
		for (Entry<Integer, Integer> e : entrySet) {
			if (e.getValue() == max) {
				System.out.println("maximum value " + e.getKey() + " value: " + e.getValue());
			}
		}
		System.out.println("max element => " + chh);
		System.out.println("frequency => " + max);

	}
}
