package com.maersk;

public class LambdaExpressionsDemo {

	public static void main(String[] args) {
		Operation operation = new Operation() {

			@Override
			public int operate(int a, int b) {

				return a+b;
			}
		};

		System.out.println(operation.operate(10, 20));

		Operation addOperation = (a,b)->{return a+b;};
		System.out.println(addOperation.operate(30, 40));
		
		Operation substractOperation = (x,y)->x-y;
		System.out.println(substractOperation.operate(200, 100));

	}

}

interface Operation {
	int operate(int a,int b);
}