package com.hoshimachi.exex;

import java.util.Scanner;

/*
 * 키보드로 정수 M 입력 2~ M가지의 소수를 찾아서 출력
 * 입력 값이 2미만일 경우 "입력오류"출력 후 재입력
 * 한줄에 소수는 5개씩 출력
 * 마지막에 소수의 개수 출력
 * 
 * 입출력 예시)
 * 정수: 1
 * 입력오류
 * 정수:100
 * [소수 출력]
 * 2 3 5 7 11
 * 13 17 19 23 29
 * 31 37 41 43 47
 * 53 59 61 67 71
 * 73 79 83 89 97
 * 
 * 소수 개수 : 25
 */
public class Exam_09 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 : ");
		int score = scn.nextInt();

		int cnt = 0;//현재까지 출력한 소수의 개수
		int i = 0;
		int x = 0;
		/*
		 * if (score < 2) { System.out.println("입력오류"); System.out.print("정수 : "); score
		 * = scn.nextInt(); }
		 */
		while (true) {
			if (score < 2) {
				System.out.println("입력오류");
				System.out.print("정수 : ");
				score = scn.nextInt();
			} else {
				break;

			}
		}

		System.out.println("소수출력 :");

		for (x = 2; x <= score; x++) {

			// x가 소수인지 판별
			// 소수 : 자기와 1로만 나눠 떨어지는 수
			for (i = 2; i < x; i++) {
				if (x % i == 0) {

					break;
				}

			}
			
			if (x == i) {
				cnt++;
				System.out.print(x+"\t");
				if(cnt%5 == 0) {
					System.out.println();
				}	

			}

		}

	}

}
