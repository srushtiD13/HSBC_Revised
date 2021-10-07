package com.hsbc.classwork;
/*
long=8 byte
int=4 byte
short=2 byte*/

public class PrimitiveTypeCasting {
	public static void main(String[] args) {
		int x=999999;
		displayLongValue(x);//long a=x HigherType=LowerType i.e Auto widening
		displayByteValue((byte) x);//byet a=x LT=HT i.e explicit narrowing
	}
	public static void displayLongValue(long a)
	{
		System.out.println("long a= "+a);
	}
	public static void displayByteValue(byte a)
	{
		System.out.println("short a= "+a);
	}

}
