package com.jslhrd.exception;
class AAA{
	String name;
	void print() throws Exception{
		try {
			
		if(name.equals("aaa")) {
			System.out.println("name :"+ name);
		}else {
			System.out.println("name :"+ null);
		}
		}catch(NullPointerException e) {
			//e.printStackTrace();
			System.out.println("예외발생 :"+ e.getMessage());
		}finally {
			System.out.println("종료합니다.");
		}
	}
}
public class Exam_07 {

	public static void main(String[] args) {
		AAA a = new AAA();
		//a.name="aaa";
		try {
			a.print();
		}catch(Exception e) {}
	}

}
