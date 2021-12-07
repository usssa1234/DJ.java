package com.jslhrd.lang;
class A{
	int x;
}
class B{
	int k;
	@Override
	public boolean equals(Object obj) {//중복체크용 꼭 알아두기!!!!
		if(obj instanceof B) {
			B aaa = (B)obj;
			return k==((B) obj).k;
		}else {
			return false;
		}
		
	}
}
public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A a1 = new A();
			A a2 = new A();
			
			System.out.println("a1==a2 : "+ (a1==a2));//값이 같은가
			System.out.println("a1.equals(a2) : "+ (a1.equals(a2)));//같은 객체인가?
			System.out.println("------------------------");
			
			B b1 = new B();
			b1.k=100;
			B b2 = new B();
			b2.k=200;
			System.out.println("b1==b2 : "+ (b1==b2));//값이 같은가
			System.out.println("b1.equals(b2) : "+ (b1.equals(b2)));//같은 객체인가?
	}

}
