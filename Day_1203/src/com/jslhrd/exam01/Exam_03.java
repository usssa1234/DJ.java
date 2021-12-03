package com.jslhrd.exam01;

interface Test02{
	void test();
}

/*
class TestExam02 implements Test02{
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("AAAA");
	}
	void aaa(){
		
	}
}
*/
public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	TestExam02 t1 = new TestExam02();
	//	Test02 t2 = new TestExam02();
		Test02 t = new Test02() {
			@Override
			public void test() {//익명 구현 개체))
				// TODO Auto-generated method stub
				System.out.println("aaaa");
			}
		};
		t.test();
	}

}
