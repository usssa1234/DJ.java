package com.jslhrd.exam03;
class A{
	int bun;
	String name;
}
interface B{
	void print();
	
}
interface C{
	void test();
	
}
class Student extends A implements B, C{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("bun : "+bun);
		System.out.println("name : "+name);
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("상속 및 구현 테스트");
	}
}
public class Exam_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student stu = new Student();
		 stu.bun=100;
		 stu.name="AAAAA";
		 stu.print();
		 stu.test();
	}

}
