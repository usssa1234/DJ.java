package com.jslhrd.annoinnerclass;
class Inner{
	public void aaa() {
		System.out.println("aaaaaaa");
	}
	public void bbb() {
		System.out.println("bbbbbbb");
	}
}
public class Exam_04 {

	public static void main(String[] args) {
		Inner in = new Inner();
		in.aaa();
		in.bbb();
		//중첩 클래스
		Inner in1 =  new Inner() {
			@Override
			public void aaa() {
			super.aaa();
			}
			@Override
			public void bbb() {
			System.out.println("bbbbbbbbbbbbbbbbbbbbbbbb");
			super.bbb();
			///
		}
		};
		

	}

}
