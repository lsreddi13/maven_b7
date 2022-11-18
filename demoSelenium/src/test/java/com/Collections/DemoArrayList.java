package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {

		
		int[] a = new int[999];
		a[0] = 4;
		a[1] = 5;
		List<Integer> list = new ArrayList<>();   
		for ( int i : a)   
		{   
		//adding each element to the List  
		list.add(i);   
		}   
		
		List<String> li = new ArrayList<>();

		li.add("sasi");
		li.add("karthik");
		li.remove(0);
		li.clear();
		
		li.get(0);
		li.isEmpty();
	
		System.out.println(li.contains("sasi"));
		
		if(li.contains("sasi")) {
		System.out.println("sasi");
		}else {
			System.out.println("no sasi");
		}
		System.out.println(li.size());
		System.out.println(li);
	}

}
