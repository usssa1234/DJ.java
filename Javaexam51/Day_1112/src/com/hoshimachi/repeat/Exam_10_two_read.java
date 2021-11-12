package com.hoshimachi.repeat;

import java.util.Scanner;

/*
 *  키보드로 1 ~ 100 사이의 정수 7개를 입력 받아서
 *  최대값, 최소값을 찾아서 출력
 */
public class Exam_10_two_read {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수입력 :");
		int score = scn.nextInt();
		int max = score;// two-read
		int min = score;// two-read
		int cnt = 1;
		while (cnt < 7) {
			score = scn.nextInt();
			if (score <= 100 && score > 0) {
				cnt++;
				if (max < score) {
					max = score;
				} else if (min > score) {
					min = score;
				}
			} else {
				System.out.println("입력 자료는 1 ~ 100 만 가능");
			}

		}
		System.out.println("max :" + max);
		System.out.println("min :" + min);

	}

}
