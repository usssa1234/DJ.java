package com.jslhrd.lang;
class AA{
	private int bun;
	private String name;
	private int age;
	AA(int bun, String name, int age){
		this.bun=bun;
		this.name=name;
		this.age=age;
	}
	void print() {
		System.out.println(bun+"\t"+name+"\t"+age);
	}
	@Override
	public String toString() { //객체를 리턴해주십쇼~~객체 자신을 출력해줘~
		return bun+"\t"+name+"\t"+age;
	}
}
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA(1, "AAA",28);
		System.out.println(a);
	//	System.out.println(a.bun+"\t"+a.name+"\t"+a.age);
		a.print();
	}

}
