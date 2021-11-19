package com.hoshimachi.ex1119;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		int score[][] = new int[10][5];// 번호 국어 영어 수학 총점
		String name[] = new String[10];// 이름
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		while (cnt < 10) {
			dataInput(cnt, score, name, scn);
			if (score[cnt][0] == 0) {
				break;
			}
			cnt++;
		}
			dataPrint(cnt, score, name);
		

	}

	// 학생 등록메소드
	static void dataInput(int cnt, int score[][], String name[], Scanner scn) {
		System.out.print("학생등록 :");
		score[cnt][0] = scn.nextInt();
		if (score[cnt][0] == 0) {
			return;// 반복문 일시엔 break;이나 그렇지 않은 경우 return으로도 해결 할 수 있다.
		}
		name[cnt] = scn.next();
		score[cnt][1] = scn.nextInt();
		score[cnt][2] = scn.nextInt();
		score[cnt][3] = scn.nextInt();
		score[cnt][4] = score[cnt][1] + score[cnt][2] + score[cnt][3];

	}

	// 데이터 출력
	static void dataPrint(int cnt, int score[][], String[] name) {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점");
		for (int x = 0; x < cnt; x++) {
			System.out.print(score[x][0] + "\t" + name[x] + "\t");
			for (int y = 1; y < score[x].length; y++) {
				System.out.print(score[x][y] + "\t");
			}
			System.out.println();
		}
	}
}
