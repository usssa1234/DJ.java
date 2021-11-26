package com.hoshimachi.ex1126;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		SawonPay[] sawon = new SawonPay[10];

		int cnt = 0;
		// 입력 및 중지
		while (cnt < 10) {
			System.out.print("사원등록 :");
			String name = scn.next();
			if (name.equalsIgnoreCase("end")) {

				break;
			}
			int pay = scn.nextInt();
			sawon[cnt] = new SawonPay(name, pay);
			cnt++;
		}
		// 출력1
		int totmoney[] = new int[10];
		System.out.print("성명\t출장비\t50,000원\t10,000원\t");
		System.out.print("5,000원\t1,000원\t500원\t100원\t");
		System.out.println("50원\t10원\t5원\t1원");
		for (int x = 0; x < cnt; x++) {
			sawon[x].sawonPayPrint();
			//
			for (int y = 0; y < 10; y++) {
				totmoney[y] += sawon[x].money[y];

			}
		}
		System.out.print("총합 매수:\t\t");
		for(int x=0; x<10; x++) {
			
			System.out.print(totmoney[x]+"\t" );
		}
		System.out.println();
	}

}
