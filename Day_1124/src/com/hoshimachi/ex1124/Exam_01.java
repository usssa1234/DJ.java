package com.hoshimachi.ex1124;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int gak[][] = new int[20][8];
		String name[] = new String[20];
		int cnt = 0;
		// 학생 정보 입력받기
		for (int x = 0; cnt < gak.length; x++) {
			System.out.print("입력 자료 :");
			gak[cnt][0] = scn.nextInt();// 번호
			if (gak[cnt][0] == 0) {// 입력종료
				break;
			}
			name[cnt] = scn.next();// 이름
			gak[cnt][1] = scn.nextInt();// 국어
			gak[cnt][2] = scn.nextInt();// 영어
			gak[cnt][3] = scn.nextInt();// 수학
			int tot = gak[cnt][1] + gak[cnt][2] + gak[cnt][3];
			gak[cnt][4] = tot;// 총점
			gak[cnt][5] = tot / 3;// 평균

		}
		// 출력
		int bu = gak[0][0];
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t판정\t불합격사유");
		for (int x=0; x < cnt; x++) {
			System.out.print(bu[x][0] + "\t" + name[x] + "\t" + gak[x][1] + "\t" + gak[x][2] + "\t" + gak[x][3] + "\t"
					+ gak[x][4] + "\t" + gak[x][5]);

			
			if (gak[cnt][1] >= 40 || gak[cnt][2] >= 40 || gak[cnt][3] >= 40) {// 판정 //불합격사유
				if (gak[cnt][5] >= 60) {
					System.out.print("\t합격\t\n");
					
				} else {
					System.out.print("\t불합격\t");
					System.out.println("\t평균미만");
				}
			} else {
				System.out.print("\t불합격\t");
				System.out.println("\t과락");
			}
		}

	}

}
