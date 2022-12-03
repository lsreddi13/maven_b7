package com.Collections;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("selenium", "1.0");
		map.put("selenium WebDriver1", "2.0");
		map.put("selenium WebDriver2", "3.0");
		map.put("selenium WebDriver3", "4.0");
		map.putIfAbsent("seleniumRC1", "Selenium RemoteControl");

//		System.out.println(map.get("selenium"));

//		for (Map.Entry m  : map.entrySet()) {
//			
//			String s1 = m.getKey() + " : "+ m.getValue();
//			System.out.println(s1);
//		}

		Map<String, String> map2 = new HashMap<>();

		map2.put("selenium1", "IDE");
		map2.put("selenium2", "grid");
		map2.putIfAbsent("seleniumRC2", "Selenium Remote Control");
		map2.putAll(map);

		for (Map.Entry m2 : map2.entrySet()) {

//			String s2 = m2.getKey() + " : " + m2.getValue();
//			System.out.println(s2);

			System.out.println(m2.getKey() + " : " + m2.getValue());
		}
		
		System.out.println("********************");
		
		map2.remove("seleniumRC1");
		for (Map.Entry m2 : map2.entrySet()) {

//			String s2 = m2.getKey() + " : " + m2.getValue();
//			System.out.println(s2);

			System.out.println(m2.getKey() + " : " + m2.getValue());
		}
//		map2.replace("seleniumRC2", "Selenium Remote Control 1.0");
		map2.replace("seleniumRC2", "Selenium Remote Control", "Selenium Remote Control 1.0");
		System.out.println("********************");
		for (Map.Entry m2 : map2.entrySet()) {

//			String s2 = m2.getKey() + " : " + m2.getValue();
//			System.out.println(s2);

			System.out.println(m2.getKey() + " : " + m2.getValue());
		}
		
		
		
		
	}

}
