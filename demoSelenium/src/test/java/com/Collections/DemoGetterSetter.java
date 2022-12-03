package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class DemoGetterSetter {
	private int sal;
	private int id = 10457;
	public int ph = 99999;

	
	List<Character> li = new ArrayList();
	
	private void tt() {
		System.out.println("method private");
	}

	public static void main(String[] args) {

		DemoGetterSetter dGS = new DemoGetterSetter();
		System.out.println(dGS.sal);
	}

//	public void getSal() {
//		
//		System.out.println(this.sal);
//	}

	public int getSal() {

		return this.sal;
	}
	
	public void setSal(int sal1) {

		this.sal = sal1;
	}
}
