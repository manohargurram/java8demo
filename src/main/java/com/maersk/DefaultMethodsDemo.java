package com.maersk;

public class DefaultMethodsDemo {

	public static void main(String[] args) {
		

	}

}

interface A{
	default void m1() {
		System.out.println("A default");
	}
}

interface B{
	default void m1() {
		System.out.println("B default");
	}
}

class C implements A,B{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		//A.super.m1();
	}

//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//		//A.super.m1();
//	}
	
}