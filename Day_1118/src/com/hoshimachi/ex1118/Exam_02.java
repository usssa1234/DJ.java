package com.hoshimachi.ex1118;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ave 배열에 {78,90,88,56,79,84,73,95,66,93,85,77}
 */
public class Exam_02 {

	public static void main(String[] args) {
		int ave[] = { 78, 90, 88, 56, 79, 84, 73, 95, 66, 93, 85, 77 };

		// 검색
		sortLink(ave);
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("점수 :");
			int score = scn.nextInt();
			if (score == -99) {
				break;
			}
			// 이진검색 시작
			int low = 0, high = ave.length - 1;
			while (true) {

				if (low > high) {
					System.out.println(score + "없음");
					break;
				}
				int m = (low + high) / 2;
				if (ave[m] == score) {
					System.out.println(score + "는" + m + "번째에 있음");
					break;
				}
				if (ave[m] > score) {
					high = m - 1;
				} else {
					low = m + 1;
				}
			}
		}
	}

	static void sortLink(int[] ave) {
		// 정렬
		for (int x = 0; x < ave.length - 1; x++) {
			for (int y = x + 1; y < ave.length; y++) {
				if (ave[x] > ave[y]) {
					int temp = ave[x];
					ave[x] = ave[y];
					ave[y] = temp;
				}
			}
		}

	}
}
