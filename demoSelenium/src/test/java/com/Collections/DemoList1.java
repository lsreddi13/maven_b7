package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		List<String> li = new ArrayList<>();
		
		
		li.add("selenium");
		li.add("JAVA");
		li.add("TestNG");
		
		li.add(1, "Maven");
//		li.set(2, "Python");
		
		Iterator<String> it = li.iterator();
		
		while (it.hasNext()) {
//			String str =  it.next();
//			System.out.println(str);
			
			System.out.println(it.next());
			
		}
		
//		System.out.println(li);
//		for(int i=0; i<li.size(); i++) {
//			System.out.println(li.get(i));
//		}
//		
//		System.out.println(li.contains("JAVA SE"));
//		
//		for (String s : li) {
//			System.out.println(s);
//			
//		}
	}

}
