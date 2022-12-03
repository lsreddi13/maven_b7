package com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DemoMapOrder {

	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(101, "selenium 1001");
		
		 
		map.put(1051, "selenium 107");
		
		map.put(103, "selenium 1030");
		
		map.put(106, "selenium 10090");
		
		
		for (Entry<Integer, String> m : map.entrySet()) {
			
			System.out.println(m.getKey() +" : "+ m.getValue());
		}
		
	}
}
