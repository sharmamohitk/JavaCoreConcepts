package com.test.naukri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValue {

	public SortMapByValue() {
	}
	public static void main(String[] args) {
		
		Map<String,Integer> unsortedMap = new HashMap<>(100);
		Map<String,Integer> sortedMap = new LinkedHashMap<>();
		
		unsortedMap.put("count1", 777);
		unsortedMap.put("count2", 877);
		unsortedMap.put("count3", 677);
		unsortedMap.put("count4", 707);
		
		Set<Entry<String, Integer>> entrySet = unsortedMap.entrySet();
		List<Entry<String, Integer>> tempList = new ArrayList<>(entrySet);
		Collections.sort(tempList, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		for (Entry<String, Integer> entry : tempList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		Set<Entry<String, Integer>> entrySet2 = sortedMap.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet2.iterator();
		while(iterator.hasNext()) {
			Entry<String, Integer> item = iterator.next();
			System.out.println(item.getKey()+"  "+item.getValue());
		}
		
	}
}
