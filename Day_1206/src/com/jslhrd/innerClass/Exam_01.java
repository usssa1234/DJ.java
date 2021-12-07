package com.jslhrd.innerClass;

public class Exam_01 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.x=200;
		//outer.disp();
		Outer.Inner oix = outer.new Inner();
		Outer.Inner oiy = new Outer().new Inner();
		oix.disp_in();
		System.out.println("-----------");
		oiy.disp_in();
	}

}
