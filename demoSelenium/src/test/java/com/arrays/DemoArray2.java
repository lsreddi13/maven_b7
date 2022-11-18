package com.arrays;

public class DemoArray2 {

	public static void main(String[] args) {
		
		
		int[] ar = {3,4,6,78,9,45};
		
		
		for(int x : ar) {
			System.out.println(x);
		}
		
		System.out.println("Array length : "+ar.length);
		
		ar[1] =0;

		System.out.println("after deleting value from array then Array length : "+ar.length);
		
		for(int x : ar) {
			System.out.println(x);
		}
		
		
		ar[6] =70;

		System.out.println("after adding value into array then Array length : "+ar.length);
		
		for(int x : ar) {
			System.out.println(x);
		}
	}
}
