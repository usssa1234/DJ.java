package com.hoshimachi.ex1117;

import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {

		int score[] = new int[6];
		// 입력 메소드 호출
		input(score);
		// System.out.println(Arrays.toString(score));
		
		// 처리 메소드 호출
		int max = process(score);
		// System.out.println(Arrays.toString(score));
		// System.out.println("max ;" + max);
		
		// 출력 메소드 호출
		print(score, max);
	}

	// 입력 메소드
	static void input(int score[]) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		for (int x = 0; x < 5; x++) {
			score[x] = scn.nextInt();
		}
	}

	// 처리 메소드(총점/최대값)
	static int process(int score[]) {
		for (int x = 0; x < score.length - 1; x++) {
			score[score.length - 1] += score[x];
		}
		// 최대값
		int max = score[0];
		for (int x = 1; x < score.length - 1; x++) {
			if (max < score[x]) {
				max = score[x];
			}
		}
		// System.out.println("max ="+max);
		return max;
	}

	// 출력 메소드
	static void print(int score[], int max) {
		System.out.print("점수1\t점수2\t 점수3\t 점수4\t 점수5\t 총점 ");
		for (int x : score) {// for(int x=0; x<score.length; x++){}
			System.out.print(x + "\t");// .print(score[x]+"\t");
		}
		System.out.print("\n");
		System.out.print("최대점수 : " + max);
	}
}
