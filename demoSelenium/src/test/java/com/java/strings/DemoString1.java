package com.java.strings;

import org.testng.annotations.Test;

public class DemoString1 {
	
	String s = "Login as shyam";
	
	public void testLength() {
		int stringLength = s.length(); // length is method in the string class
		System.out.println(stringLength);
		
		char c = s.charAt(10);
		
		System.out.println(c);
		
		
		//singleton class
		//what is the diff b/w string buffer and string builder
		
		//what is the diff b/w string declaration and string s = new string
		
//		"hello this is selenium webdriver"
//		
//		"webdriver"
//		
//		print duplciate characters
//		
//		print unnique characters
//		
//		print the number of occurances the duplicate characters
//		
//		print in reverse order
//		
//		prnit in reverse order word by word ( mirror style)
//
//		how do you find a string inside the another string
//		
//		how to seperate valeus from string - s6b7c8
//		
//		what is the result of 
//		System.out.println(3+4+"hello"+3+4);
		//"fsadf".equals("fasf")
//		String sp1 = "abcd";
//		String sp2 = new String("abcd");
//		StringBuffer sb1 = new StringBuffer("abcd");
//		sp1 == sp2;
//		sp1 == sb1;
//		sp1.equals(sb1);
		
		//"fadsf"=="fadsf";
		
		
	int i=	s.indexOf('i');
	System.out.println("i place value : "+i);
	
	String str1 = s.substring(s.indexOf('s'));
	
	System.out.println(str1);
	
	String str2 = s.substring(s.lastIndexOf('s'));
	System.out.println(str2);
	
	}
	public void testNewString(String ss) {
		String s2 = new String(ss);
		
		System.out.println(s2); // syso - ctrl + space
		
		System.out.println(s2.length());
		
		
	}
	
	
	
	@Test
	public void testStrigns() {
		testLength();
//		testNewString("dfsadf");
		
	}

}
