package com.hoshimachi.ex;
/*
 *  세 수 중 가장 큰 값 찾기
 */
public class Exam_04 {

	public static void main(String[] args) {
		int a=70;
		int b=90;
		int c=67;
		int max=a;
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		System.out.println(a +","+ b + "," + c);
		System.out.println("max = "+ max);
	}
		
}
