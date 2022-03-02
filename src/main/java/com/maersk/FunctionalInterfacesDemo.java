package com.maersk;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesDemo {

	public static void main(String[] args) {
		Consumer<String> consumer = s->System.out.println(s);
		consumer.accept("manohar");
		
		Supplier<String> supplier = ()->"hello world";
		System.out.println(supplier.get());

		Predicate<String> predicate = s->s.startsWith("m");
		System.out.println(predicate.test("kmanohar"));
		
		Function<Integer, Integer> function = n->n*n;
		System.out.println(function.apply(10));
	}

}

@FunctionalInterface
interface MyInterface {
	public void m1();
	default public void m4() {
		
	}
	default public void m2() {
		
	}
	static public void m3() {
		
	}
	
	@Override
	boolean equals(Object obj);
	@Override
	int hashCode();
	@Override
	String toString();
}