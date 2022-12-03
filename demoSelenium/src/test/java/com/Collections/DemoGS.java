package com.Collections;

public class DemoGS extends DemoGetterSetter{

	public static void main(String[] args) {
		DemoGetterSetter dGS = new DemoGetterSetter();
//		System.out.println(dGS.sal);
		
//		dGS.tt();
//		dGS.getSal();
//		System.out.println(dGS.getSal());
		dGS.setSal(95000);
		int salary = dGS.getSal();
		
		dGS.setSal(75000);
		int salary2 = dGS.getSal();
		
		System.out.println(salary);
		System.out.println(salary2);
		System.out.println(dGS.ph);
	}
}
