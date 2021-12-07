package com.jslhrd.staticcindderClass;

public class Outer {
	private int x= 100;
	private static int y= 200;
	public void disp() {
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
	static class Inner{
		private int a= 10;
		static int b = 20;
		void disp_in() {
//			System.out.println("x="+x);
			System.out.println("x="+y);
			System.out.println("x="+a);
			System.out.println("x="+b);
		}
	}
}	
