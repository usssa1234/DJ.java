package com.hoshimachi.ex;

import java.util.Scanner;

// 키보드를 정수를 입력받아서 80이상이면 "PASS" 출력
public class Exam_01 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int score = scn.nextInt();
		
		if(score >= 80) {
			System.out.println("PASS");
		
		}else {
			System.out.println("NO");
		}
		
		System.out.println("프로그램종료");
	}

}
