package com.hoshimachi.exex;

/*
 * 행열처리
 * 	*****
 * 	*****
 * 	*****
 * 	*****
 * 	*****
 */
public class Exam_08 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int e = 0; e < 5; e++) {

				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
		for (int i = 0; i < 5; i++) {
			for (int e = 5; e > 0; e--) {

				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");
		for (int i = 1; i <= 5; i++) {
			for (int e = 1; e <= i; e++) {

				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");// 1
		for (int i = 1; i <= 5; i++) {
			for (int e = 5; e >= i; e--) {

				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------");// 2
		for (int i = 5; i >= 1; i--) {
			for (int y = 4; y >= i; y--) {
				System.out.print(" ");
			}

			for (int e = 1; e <= i; e++) {

				System.out.print("*");
			}

			System.out.println("");
		}
		System.out.println("----------");// 3
		for (int i = 1; i <= 5; i++) {
			for (int y = 4; y >= i; y--) {
				System.out.print(" ");
			}

			for (int e = 1; e <= i; e++) {

				System.out.print("*");
			}

			System.out.println("");
		}
		System.out.println("----------");// 4
		for (int i = 1; i <= 5; i++) {
			for (int y = 4; y >= i; y--) {
				System.out.print(" ");
			}

			for (int e = 1; e <= i*2-1; e++) {
				
				System.out.print("*");
				
			}

			System.out.println("");
		}
		
		
	}

}
