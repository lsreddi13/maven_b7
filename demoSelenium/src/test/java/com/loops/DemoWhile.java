package com.loops;

public class DemoWhile {

	public static void main(String[] args) {
		DemoWhile DW = new DemoWhile();
//		DW.testWhile1();
		DW.testDoWhile1();
		
		
	}

	public void testWhile1() {
		int i = 11;

		while (i < 10) {
			// logic
			System.out.println("hello");

			i++;
		}

	}

	public void testDoWhile1() {
		int x = 11;
		do {
			System.out.println("xvalue : "+x);
			x++;
		} while (x<10);

	}

}
