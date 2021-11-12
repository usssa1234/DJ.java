package com.hoshimachi.repeat;

import java.util.Scanner;

/*
 * 키보드로 급여(금액)을 입력받아서 화폐 단위별 매수를 구하여 출력
 *  급여(금액) : 176668
 */
public class Exam_12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("급여(금액 :");
		int pay = scn.nextInt();
		int money = 50000;
		boolean flag =true;
		
		while(pay>0) {
			System.out.print(money +"원 : ");
			int mok = pay / money;
			System.out.println(mok +"장");
			pay = pay% money;
			if(flag) {
				money = money/5;
				flag = false;
			}else {
				money = money/2;
				flag = true;
			}
		}
	}

}
