package com.Collections;

public class Acc1 {

	private String testpr1 = "selenium";

	private void t12() {
		System.out.println("this is tset12 private method.");
	}

	public static void main(String[] args) {

		Acc1 ss = new Acc1();
		System.out.println(ss.testpr1);

		ss.t12();
	}

	
}