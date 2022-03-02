package com.maersk;

import java.util.function.Consumer;

public class MethodReferencesDemo {

	public static void main(String[] args) {
		Consumer<String> consumer = s->new MethodReferencesDemo().m1(s);
		consumer.accept("manohar");
		
		Consumer<String> consumer2 = new MethodReferencesDemo()::m1;
		consumer2.accept("krishna");
		
		Consumer<String> consumer3 = MethodReferencesDemo::m2;
		consumer3.accept("praveen");

	}
	
	public void m1(String name) {
		System.out.println("m1 called:"+name);
	}
	
	public static void m2(String name) {
		System.out.println("m2 called:"+name);
	}

}

