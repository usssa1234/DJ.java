package com.jslhrd.innerClass;

public class Outer {
	int x=100;
	private int y=200;
	private static int z=300;
	public Outer() {}
	public void disp() {
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
	}
	class Inner{//outer 속에 inner 클래스가 있는 상황을 중첩클래스라고 한다.
		private int a = 1000;
		public void disp_in() {
			System.out.println("x="+x);
			System.out.println("y="+y);
			System.out.println("z="+z);
			System.out.println("a="+a);
		}
	}
}
/*
class A{
	Outer outer = new Outer();// 포항클래스
}
*/