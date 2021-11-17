package com.hoshimachi.ex1117;
/*
 * 메소드 사용법
 */
public class Exam_01 {
	static void method_01() {
		System.out.println("method_01() 호출됨");
	}
	static void method_02(int a, int b) {
		int c = a + b;
		System.out.println("method_02() 호출됨 c= "+c);
	}
	static int method_03() {
		System.out.println("method_03() 호출됨");
		int s = 0;
		for(int x=1; x<=10; x++) {
			s+=x;
		}
		return s;
		
	}
	static int method_04(int[] a) {//참조에 의한 호출
		System.out.println("method_04() 호출됨");
		int s = 0;
		for(int x=0; x<=a.length; x++) {
			s+=a[x];
		}
		return s;
		
	}
	
	public static void main(String[] args) {
		method_01();
		method_02(10, 20);
	 int sum = method_03();
	 System.out.println("sum ="+sum);
	 int score[] = {1,2,3,4,5,6,7,8,9,10};
	 int tot = method_04(score); //참조에 의한 호출 *메인은 호출 할 수 없다
	 System.out.println("t= "+tot);
	}

}
