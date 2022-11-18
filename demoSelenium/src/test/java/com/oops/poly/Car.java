package com.oops.poly;

public class Car extends Vehicle{
	public void engine() {
		System.out.println("this is car class engine.");
		
	}
	
	public void test1Method() {
		System.out.println("this is test1 method.");
	}
	
	public static void main(String[] args) {
		
		Car cc = new Car();
		cc.engine();
		cc.test1Method();
		cc.carColor();
	
		Vehicle vv = new Vehicle();
//		vv.carColor();
		vv.engine();
		
		Vehicle vc = new Car();
		vc.carColor();
		vc.engine();
		
//		Car cv = new Vehicle();
		
		
	}
}
