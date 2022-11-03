package com.java.ifconditionsDemo;

import java.util.Scanner;

public class DemoSwitch {
	public static void main(String[] args) {

//				1 = Sunday
//				2 = Monday
//				3 = Tuesday
//				4 = Wednesday
//				5 = Thursday
//				6 = Friday
//				7 = Saturday

//		int marks = 35;
		DemoSwitch DS = new DemoSwitch();

		DS.testIf(4);
		DS.pridayDayName(5);
//		Scanner s = new Scanner(System.in);
//		System.out.println("pls enter day number : ");
//		int daynumber = s.nextInt();
//		DS.pridayDayName(daynumber);

	}

	public void testIf(int dayNumber) {

		if (dayNumber == 1) {
			System.out.println("Sunday");
		} else if (dayNumber == 2) {
			System.out.println("Monday");
		} else if (dayNumber == 3) {
			System.out.println("Tuesday");
		} else if (dayNumber == 4) {
			System.out.println("Wednesday");
		} else if (dayNumber == 5) {
			System.out.println("Thursday");
		} else if (dayNumber == 6) {
			System.out.println("Friday");
		} else if (dayNumber == 7) {
			System.out.println("Saturday");
		} else {
			System.out.println("no day");
		}
		System.out.println("this is completed.");
	}

	public void pridayDayName(int dayNumber) {

		switch (dayNumber) {
		case 1:
			System.out.println("Sunday");
			
			
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("no day");
			break;
		}
		
		System.out.println("hello i completed.");
	}
}
