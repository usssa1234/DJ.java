package com.hoshimachi.exex;

import java.util.Scanner;

/*
 * 소수 판별기!
 */
public class Exam_07 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int val = scn.nextInt();
		int x;
		
		
		for(x=2; x<val; x++) {
			if(val%x ==0) {
				break;
			}
		}
		if(val == x) {
			System.out.println(val+" 는 소수입니다");
		}else {
			System.out.println(val+" 소수가 아닙니다");
		}
		
	}
	
	/*
	 * 
	 *
	 */
	 

}
