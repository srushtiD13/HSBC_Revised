package com.hsbc.classwork;

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar a1=new StaticVar();
		StaticVar a2=new StaticVar();
		
		a1.i=20;
		a2.i=30;
		//StaticVar.i=40;
		
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(StaticVar.i);

	}

}
