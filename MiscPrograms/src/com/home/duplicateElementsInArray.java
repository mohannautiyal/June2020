package com.home;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateElementsInArray {

	public static void main(String[] args) {

		int arr[] = {5,2,4,5,6,5,7,3,5,2,7,3,5 };
      // Finding duplicate using Set

		Set<Integer> arrSet = new HashSet<Integer>();
		for (int a : arr) {
			if (!arrSet.add(a))
				System.out.println(a + " is duplicate");
		}

		// arrSet.stream().forEach(System.out::println);

		System.out.println(" ============= HashMap ================");
		// Finding duplicate using HashMap
		HashMap<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
		int val = 0;
		for (int a : arr) {
			if (arrMap.containsKey(a))
				arrMap.put(a, (arrMap.get(a) + 1));
			else
				arrMap.put(a, 1);

		}

		for (Entry<Integer, Integer> e : arrMap.entrySet()) {

			System.out.println(e.getKey() + "  count is " + e.getValue());

		}

	}

}
