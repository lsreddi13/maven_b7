package com.arrays;

public class DemoArray1 {
	public static void main(String[] args) {

//		int[] a = { 2, 3, 4, 5 }; // 3 values size 3.
//		int d = a.length;
//		System.out.println("arrays size : " + d);

//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);

//		for (int i = 0; i < d; i++) {
//
//			System.out.println(a[i]);
//
//		}

		int[] ar1 = new int[5];
		
//		ar1[0] = 3;
//		ar1[1] = 12;
//		ar1[2] = 34;
//		ar1[3] = 643;
//		ar1[4] = 33;
//		
		
		for (int i = 0; i < ar1.length; i++) {

			ar1[i] = 56+i;

		}

		for (int i = 0; i < ar1.length; i++) {

			System.out.println(ar1[i]);

		}
		
		String[] names =new String[5];
		
		
		for (int i = 0; i < names.length; i++) {

			names[i] = "sasi"+i;
			System.out.println(names[i]);

		}
		
		//how do you print last index value
		
		//how do you print first index value
		
		//how do you print max value
		

		//how to delete array value based on index
		//how to delete arrayvalues
		//print large value from array
		//print smallest value from array
		//sort min to max valus in array - ascending  and descending
		
		
	}
}
