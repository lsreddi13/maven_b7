package com.loops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DemoForLoop {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"E:\\automationworkspace\\demoSelenium\\src\\test\\java\\com\\loops\\values.properties");
		prop.load(fis);
		DemoForLoop DFP = new DemoForLoop();
//		DFP.testForLoop(30);		
		int k = Integer.parseInt(prop.getProperty("val1"));
//		DFP.testForLoop(k);
		DFP.testForLoop2();

	}

	public void testForLoop1(int j) {
		System.out.println(j);
		int i;
		// print hello 10 times
		for (i = 1; i < j; i++) {
			System.out.println("hello" + i);
		}

	}

	public void testForLoop2() {
		int x = 3;
		int[] a = { 10, 20 };
		int s = 20;
		for (int ss : a) {
			System.out.println(ss);
		}

	}

	public void testForLoop3() {

		String[] aa = { "selenium WebDriver", "java", "testNG" };
		for (String ss : aa) {
			System.out.println(ss);
		}

	}

	public void testForLoop4() {

		double[] bb = { 3, 3.33 };
		for (double ss : bb) {
			System.out.println(ss);
		}

	}

}
