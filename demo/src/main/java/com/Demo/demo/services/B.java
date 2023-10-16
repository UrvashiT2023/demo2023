package com.Demo.demo.services;

public class B extends A {
	public B() {
	super.run(3, 2);
	}
	public static void main(String[] args) {
		A a = new B();
int c=	a.run(2, 3);

	}
public int run(int a, int b) {
	return a*b;
}


}
