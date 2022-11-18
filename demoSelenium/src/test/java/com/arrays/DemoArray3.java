package com.arrays;

public class DemoArray3 {
	public static void main(String[] args) {
		int[] ar2 = new int[5];

		for (int i =0; i<=ar2.length; i++) {
			System.out.println(ar2[i]);
			
			
			ar2[i]= i+100;
			System.out.println(ar2[i]);
		}
		
	}
}
