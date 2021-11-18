package com.hoshimachi.exex;

import java.util.Scanner;

/*
 * 1 ~ 10 사이의 정수 10개를 입력 받아서 합과 평균을 구하여 출력
 * 입출력 예시
 * 입력 : 1 0 7 5 6 8 0 8 7 6 5 4 3 2
 */
public class Exam_04 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		
		int sum= 0;
		int cnt = 0;
		while(cnt<10) {
			int su = scn.nextInt();
			if(1>su || su>10) {
				continue;
				
			}
			cnt++;
			sum+=su;
		
			
			
		}
		
		
		System.out.println("합계:"+sum);
		System.out.println("평균"+(sum/10));
	}
}
