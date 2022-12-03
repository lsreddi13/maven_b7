package com.Collections;

public class P2 extends P1{
	
	String name = "P2";
	String id = "78910";
	
	public void test1() {
		System.out.println("this is test2.");
	}
	
	P2(){
		super();
		System.out.println(super.name);
		System.out.println(name);
		super.test1();
		
	}
	P2(String name){
		super();
		System.out.println(super.name + name);
		System.out.println(name);
		super.test1();
		this.test1();
		
	}
	P2(int id){
		super();
		System.out.println(super.name + id);
		System.out.println(name);
		super.test1();
		
	}

}
