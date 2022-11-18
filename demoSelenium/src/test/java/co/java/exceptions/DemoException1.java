package co.java.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class DemoException1 {

	public static void main(String[] args) {
		try {
			// code that may raise exception
			int data = 100 / 0;

			int a[] = new int[5];
			a[3] = 50; // ArrayIndexOutOfBoundsException
			// rest code of the program
			Properties prop = new Properties();

			FileInputStream fis;

			fis = new FileInputStream("c://desktop//test.properties");

//					prop.getProperty("username");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		}catch (Exception e) {
			System.out.println("common expcetion : "+e);
		}
		System.out.println("rest of the code...");
	}
}
