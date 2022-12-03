package com.Collections;

import java.util.HashMap;
import java.util.Scanner;

public class DemoCopyGoogleHashMap {

	public static void main(String[] args) {
		
//		HashMap<String, String> map = new HashMap<>();
		
		// Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String, Integer> map = new HashMap<>();
 
        // Adding elements to the Map
        // using standard put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
 
        for( int a =1; a<6; a++) {
        // add anotehr 10 people 
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value : ");
        String key = scanner.nextLine();
        
//        String value = scanner.nextLine();
        int x =Integer.parseInt(scanner.nextLine());
        
        map.put(key, x);
        
        }
        // Print size and content of the Map
        System.out.println("Size of map is:- "
                           + map.size());
 
        // Printing elements in object of Map
        System.out.println(map);
		
        if (map.containsKey("vishal")) {
        	 
            // Mapping
            Integer a = map.get("sachin");
 
            // Printing value for the corresponding key
            System.out.println("value for sachin " + a);
        }
		
		
	}
	
	
}
