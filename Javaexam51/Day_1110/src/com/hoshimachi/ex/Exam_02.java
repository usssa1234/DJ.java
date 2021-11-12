package com.hoshimachi.ex;

import java.util.Scanner;

/*
 *  키보드로 정수를 입력 받아서 입력받은 값이 80 ~ 90 사이라면
 *  "Pass" 아니라면 "No"를 출력하시오.
 */
public class Exam_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int score = scanner.nextInt();

		if (score >= 80 && score <= 90) {
			System.out.println("Pass");
		} else {
			System.out.println("No");
		}

		/*
		 * if (score >= 80) { if (score <= 90) { System.out.println("Pass");
		 * 
		 * } else { System.out.println("No"); } }else { System.out.println("No"); }
		 */
	}

}
