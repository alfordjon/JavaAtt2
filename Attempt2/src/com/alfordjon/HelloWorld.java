package com.alfordjon;

public class HelloWorld {

	public static double doMagicStuff(double one, double two) {
		return one + two;
	}
	
	public static void main(String[] args) {
		doMagicStuff(3d, 5d);
		System.out.println("Hello World - "+doMagicStuff(3d, 5d));
	}
}
