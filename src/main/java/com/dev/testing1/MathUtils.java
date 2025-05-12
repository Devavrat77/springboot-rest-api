package com.dev.testing1;

public class MathUtils {
	
	public int add(int a , int b) {
		return a+b;
	}
	
	public int multiply(int a , int b) {
		return a*b;
	}
	
	public double divide(double a , double b) {
		if(b==0) {
			throw new ArithmeticException();
		}
		return a/b;
	}
	public void greet() {
		System.out.println("Commit msg");
		System.out.println("Second commit msg");
	}
}
