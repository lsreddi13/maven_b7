package com.java.ifconditionsDemo;

import java.util.Scanner;

public class DemoIfCondition {
	public static void main(String[] args) {

		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.print("Enter the number: "); // reading value from the user int
		 * marks = scan.nextInt();
		 */

		
		DemoIfCondition dic = new DemoIfCondition();
		dic.printResult2(81);
//		dic.printResult(45);
		System.out.println("hello");
		
	}

	public void printResult(int marks) {
		if (marks >= 35) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}
	
	
	public void printResult2(int marks) {
		 if(marks >35 && marks <60) {
			System.out.println("second class pass");
		} else if (marks >60 && marks <70) {
			System.out.println("first class pass");
		}else if(marks >70 ) {
			System.out.println("distinction pass");
		}else {
			System.out.println("fail");
		}
	}

}
