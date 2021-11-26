package com.hoshimachi.ex1126;

import java.util.Scanner;

public class ParkingExam {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Parking [] park = new Parking[10];
		int cnt=0;
		//입력 및 중지
		while(cnt<10) {
			System.out.print("주차정보 :");
			String carNo = scn.next();
			if(carNo.equalsIgnoreCase("0000")) {
				break;
			}
			int parkTime = scn.nextInt();
			park[cnt] = new Parking(carNo, parkTime);
			cnt++;
		}
		//출력
		System.out.println("차량번호\t주차시간\t주차요금");
		for(int x=0; x<cnt; x++) {
			park[x].anounce();
		}
		

	}

}
