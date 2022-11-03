package com.java.mehods;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// reading value from the user
		int num1 = scan.nextInt();

		int num2 = scan.nextInt();
		
		int add = num1 + num2;
		System.out.println(add);
	}

}
