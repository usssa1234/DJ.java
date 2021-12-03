package com.jslhrd.exam02;
interface A{
	void test01();
	void test02();
}
interface B{
	void method01();
	void method02();	
}
interface AA extends A{
	//인터페이스를 상속해서 새로운 인터페이스를 만들 수 있다.
	
}
interface AAA extends AA, B{
	
}
class AB implements A, B{
	@Override
	public void test01() {
		
		
	}
	@Override
	public void test02() {
		
		
	}
	@Override
	public void method01() { 
	
	}
	@Override
	public void method02() {
		
		
	}
}
public class Exam_05 {

	public static void main(String[] args) {
		

	}

}
