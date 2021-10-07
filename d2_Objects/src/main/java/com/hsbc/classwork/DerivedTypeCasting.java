package com.hsbc.classwork;

class A{
	void testA()
	{
		System.out.println("testA() in A");
	}
}

class B extends A{
	void testA()
	{
		System.out.println("testA() in B");
	}
	
	void testB()
	{
		System.out.println("testB() in B");
	}
}

class C extends B{
	void testA()
	{
		System.out.println("testA() in C");
	}
	
	void testC()
	{
		System.out.println("testC() in C");
	}
}

public class DerivedTypeCasting {
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		C c=new C();
		display(c);
	}
	
	public static void display(A a)//upcasting
	{
		a.testA();//valid
		//even if we send object of B/C class, it is valid. Because they are extended and have testA method
		//But if method receives object of B and wants to access testB, it is not possible directly creates RTE
		//for that we need to downcast object
		//before check if a is instance of B/C
		
		if(a instanceof B)
		{
			//DOWNCAST
			//Reference of type B and object also of type B(casted to B)
			B b=(B)a;
			b.testB();
		}
		
		//if we pass object of C, it will pass the condition of if(a instanceof B) becoz when object C is created,
		//by default object of A and B are created
		
		if(a instanceof C)
		{
			//DOWNCAST
			//Reference of type B and object also of type B(casted to B)
			C c=(C)a;
			c.testC();
		}
		
		
		
		
		A x=a;//also valid
		//because LHS=RHS reference is of type A and object is of type A
	}
}
