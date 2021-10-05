package com.hsbc.classwork;

public class TestDemoBlock {

	public static void main(String[] args) {
		System.out.println("main starts ");
		//here also first SIB will be called. 
		//then as object is created, IIB is called and then constructor
		Demo d=new Demo();
		
		//here creating object of this class hence IIB will also be called
		TestDemoBlock t=new TestDemoBlock();
		System.out.println("main ends");

	}
	
	//static block will be executed before any other method. Even before main method
	static
	{
		System.out.println("SIB TestDemoBlock");
	}
	
	{
		System.out.println("IIB TestDemoBlock");
	}

}

//once the class loads, all the static members will be added on stack. 
