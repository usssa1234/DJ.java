package com.hoshimachi.exex;

import java.util.Scanner;

/*
 * 1 ~ 10 사이의 정수 10개를 입력 받아서 합과 평균을 구하여 출력
 * 입출력 예시
 * 입력 : 1 0 7 5 6 8 0 8 7 6 5 4 3 2
 */
public class Exam_05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		System.out.print("입력 : ");
		for (cnt = 0; cnt < 10; cnt++) {
			int score = scn.nextInt();
			if(1>score || score>10) {
				cnt--;
				continue;
			}
			sum += score;
		}
		System.out.println("합계:" + sum);
		System.out.println("평균" + (sum / 10));
	}
}
