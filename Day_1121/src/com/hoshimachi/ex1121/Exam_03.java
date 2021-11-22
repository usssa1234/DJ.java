package com.hoshimachi.ex1121;

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String sain[] = new String[10];
		int pay[][] = new int[10][2];
		int cnt;


		// 번호 이름
		for (cnt = 0; cnt < pay.length; cnt++) {
			System.out.print("입력 : ");
			pay[cnt][0] = scn.nextInt();// 번호
			if (pay[cnt][0] == -9999) {// 처리조건
				break;
			}
			sain[cnt] = scn.next();// 이름
			pay[cnt][1] = scn.nextInt();// 출장비

		}
		// 출력
		System.out.println("번호\t이름\t출장비\t50000원\t10000원\t5000원\t1000원\t500원\t100원\t50원\t10원\t5원\t1원");
		int money[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int tot[] = new int[10];
		for (int x = 0; x < cnt; x++) {
			System.out.print(pay[x][0] + "\t" + sain[x] + "\t" + pay[x][1]+"\t");
			for (int y = 0; y < 10; y++) {
				System.out.print(""+ pay[x][1] / money[y] +"개\t");
				tot[y]+=(pay[x][1]/money[y]);
				pay[x][1] %= money[y];
			}
			System.out.println();

		}

		// 단위별 전체매수
		System.out.print("전체매수:\t\t");
		for(int x=0; x<tot.length; x++) {
			System.out.print("\t"+tot[x]);
		}


	}

}
