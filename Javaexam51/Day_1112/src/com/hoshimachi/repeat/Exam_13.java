package com.hoshimachi.repeat;

import java.util.Scanner;

/*
 *  1~100사이) 7개를 입력 받아서 최대값, 최소값을 뺀 나머지 합계, 평균을 구하여
 *  출력(단 평균은 소수 둘째자리에서 반올림)
 *  단, 입력점수의 범위를 벗어난 값이 입력될 경우"입력오류"를 출력 후 재입력한다.
 *  평균이 100~87이면 "A", 86~73이면"B", 72~55이면"C",0~55이면"D" 출력한다.
 *  
 *  입력예시 :
 *  입력 점수 : 100
 *  입력 점수 : 95
 *  입력 점수 : 0
 *  입력오류
 *  입력 점수 : 100
 *  
 *  출력예시:
 *  최대점수 : 100
 *  최소점수 : 79
 *  합계 : 468
 *  평균 : 93.6(A)
 */
public class Exam_13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력예시 :");
		int cnt = 0;
		int ewp = scn.nextInt();
		while (cnt < 7) {
		if(ewp <= 100 && ewp >0) {
			System.out.println("입력 점수 :");
			ewp = scn.nextInt();
		}else if(ewp>100&& ewp<=0){
			System.out.println("입력 오류");
			cnt++;
			break;
			
			
			}
			
			
		}
	}

}
