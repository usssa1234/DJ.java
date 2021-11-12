package com.hoshimachi.ex;

import java.util.Scanner;

/*
 *  정수 3개 입력 +,-,*,/,% 를 계산하는 프로그램 작성
 *  입력 예시 ) 정수입력 : 1 7 3 (첫 정수가 1(+), 2(-), 3(*), 4(/), 5(%)
 */
public class Exam_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력 : ");
		int score = scanner.nextInt();
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		
		
		if(score == 1) {
		
			System.out.println(val1+"+"+val2+"="+(val1+val2));
			
		}else if(score == 2) {
			
			System.out.println(val1+"-"+val2+"="+(val1-val2));
			
		}else if(score == 3) {
		
			System.out.println(val1+"*"+val2+"="+(val1*val2));
			
		}else if(score == 4) {
			
			System.out.println(val1+"/"+val2+"="+(val1/val2));
			
		}else if(score == 5) {
			
			System.out.println(val1+"%"+val2+"="+(val1%val2));
			
		}else {
			System.out.println("연산자 오류");
		}
		
		
	}
}
