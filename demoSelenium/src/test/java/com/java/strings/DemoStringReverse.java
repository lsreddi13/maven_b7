package com.java.strings;

import org.testng.annotations.Test;

public class DemoStringReverse {
	
	
	@Test
	public void testStrRev() {
		
		String str1 = "Selenium,Webdriver,auto mation,Testing";
		String[] sr1 = str1.split(",");
		
		System.out.println(sr1.length);
		
		for (String string : sr1) {
			System.out.println(string);
		}
		
		
		String[] sr = {"Selenium", "Webdriver", "automation"};
		
		boolean x = str1.contains("automaton");
		System.out.println(str1.contains("automation"));
		System.out.println(x);
		
		String reverse ="";
		for(int i= str1.length()-1; i>=0; i--) {
			
			char c = str1.charAt(i);
			reverse +=c;
			
		}
		System.out.println(reverse);
		
//		String s1 = new String("Sel");
//		
//		
//		StringBuffer str2 = new StringBuffer("Selenium WebDriver");
//		System.out.println(str2.reverse());
//		
//		
//		StringBuilder sb1 = new StringBuilder("Automation");
//		System.out.println(	sb1.reverse());
		
		
		
	}

}
