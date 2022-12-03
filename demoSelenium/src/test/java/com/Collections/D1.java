package com.Collections;

public class D1 {

	 // declaring an instance variable
	  int instanceVar = 5;

	  // declaring an static variable
	  static int staticVar = 10;

	  void Scaler() {
	    // Method-specific variables
	    int instanceVar = 20;
	    int staticVar = 40;
	      
	    // referring to the current class instance and static variables
	    this.instanceVar = 50;
	    this.staticVar = 100;

	    // printing the current class instance and static variable.
	    System.out.println("Value of instance variable : " + this.instanceVar);
	    System.out.println("Value of static variable : " + this.staticVar);
	      
	    // printing the method specific variables.
	    System.out.println("instanceVar inside method : " + instanceVar);
	    System.out.println("staticVar inside method: " + staticVar);
	  }
}
