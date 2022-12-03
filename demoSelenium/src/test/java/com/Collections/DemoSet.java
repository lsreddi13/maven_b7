package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoSet {
	
	
	public static void main(String[] args) {
		
		//create an int array
		int a[] = {2,3,4,5}; // array size 4
		
		int b[] = new int[4];
		b[0] = 3;
//		System.out.println(b.length);
//		System.out.println(a.length);
//		System.out.println(Arrays.toString(a));
		
		List<Integer> li = new ArrayList<>();
		li.add(3); // list size 1 ,
		//after 10 values in to this list then the list size is 11
		
		
		List<String> states = new ArrayList<>();
		states.add("Telangana1"); // list size 1 ,
		//after 10 values in to this list then the list size is 11
		
		states.add("Telangana2");
		states.add("Telangana3");
		states.add("Telangana4");
		states.add("Telangana5");
		states.add(1, "Haryana5");
		
		
//		System.out.println(states.size());
//		System.out.println(states);
		
		Set<String> s = new HashSet<String>();
		s.add("Telangana1");
		s.add("Telangana2");
		s.add("Telangana3");
		s.add("Telangana4");
		s.add("Telangana5");
//		s.clear();
//		Set<String> s1 = new HashSet<String>();
//		s1.add("Telangana1");
//		s1.add("Telangana2");
//		s1.add("Telangana3");
//		s1.add("Telangana41");
//		s1.add("Telangana51");
//		s1.add("Telangana61");
//		
//		
//		
		
//		s.retainAll(s1);
		System.out.println(s.size());

		System.out.println(s);
		s.remove("Telangana1");
		System.out.println(s.size());

		System.out.println(s);
		
		Map<Integer, String> m = new HashMap<>();
		
	m.put(1, "Selenium");
	m.put(2,  "java");
	
//	System.out.println(m.size());
	
//	System.out.println(m);
		
//	System.out.println(m.get(1));
	
	
	
	
	for (Integer i : m.keySet()) {
		  System.out.println( m.get(i));
		}
		
	}

}
