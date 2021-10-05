package com.hsbc.classwork;

public class Demo {
	Demo()
	{
		System.out.println("Demo() constructor");
	}
	Demo(int a)
	{
		System.out.println("Demo(int) constructor");
	}
	
	//static initialization block SIB
	static
	{
		System.out.println("SIB Demo");
	}
	
	//Instance initialisation block
	
	{
		System.out.println("IIB Demo");
	}
	
	public void test1()
	{
		System.out.println("test1() Demo");
	}
	
	public static void test2()
	{
		System.out.println("static test2() Demo");
	}

}
