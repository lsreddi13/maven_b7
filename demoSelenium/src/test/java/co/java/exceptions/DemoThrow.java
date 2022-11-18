package co.java.exceptions;

import org.openqa.selenium.ElementClickInterceptedException;

public class DemoThrow {
	public static void main(String[] args) {

		int data = 100 / 0;//run time error
		throw new ArithmeticException();
		
	}
	
	public void te1() {
	int a =5, b=6, g;
	g = a+b;
	System.out.println(g);
	System.out.println(a+b);
		throw new ElementClickInterceptedException("this mesage wil print at the exception console.");


		
	}
}
