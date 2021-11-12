package com.hoshimachi.repeat;

import java.util.Scanner;

/*
 *  키보드로 1 ~ 100 사이의 정수 7개를 입력 받아서
 *  최대값, 최소값을 찾아서 출력
 */
public class Exam_09 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int max = 0;
		int min = 101;
		int cnt = 0;

		System.out.print("정수입력 :");
		while (cnt < 7) {
			int score = scn.nextInt();
			if (score <= 100 && score > 0) {
				cnt++;
				if (max < score) {
					max = score;
				}
				if (min > score) {
					min = score;
				}
			}

		}
		System.out.println("max :" + max);
		System.out.println("min :" + min);

	}

}
