package com.jslhrd.exam01;
// 상수냐 리터럴(값 1,2,3,'A',)이냐
public interface InterExam01 {
	static final int MAX=100;
	abstract void method();
	//abstract가 붙어야하지만 인터페이스도 추상클래스와 비슷하므로 인터페이스 내에서의 생략도 가능하다.
	int method_01(int x, int y);
	
	// jdk1.8부터는 default, static이 붙을 경우에는 인터페이스 내에서 사용가능 
	default void test() {
	}
	static int sum(int a, int b) {
		
		return 0;
	}
}
