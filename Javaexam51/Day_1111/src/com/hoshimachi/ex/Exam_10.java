package com.hoshimachi.ex;

import java.util.Scanner;



public class Exam_10 {



	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("입력 자료 :");

		String car = scn.next();

		int tim = scn.nextInt();

		System.out.println("자동차번호 : "+car);

		int price = 0;

		int period = 10; //요금에 필요한 분단위

		price = ((tim + 9)/period)*500-1000;
		int maxPrice = 30000;
		/*
		 int price =0;
		 if(time>=10){
		 price = 500;
		tim = tim - 30;
		int na = time/10;
		}
		if(time %10 != 0) {
		price = price + na*500;
		}
		 */
		if(tim < 10){

			price = 0;

			System.out.println("무료");

		}else if(tim <= 30) {

			System.out.println("주차요금 :500원");

		}else if(price > maxPrice) {

			System.out.println("30000원");

		}else {

			System.out.println("주차요금 :"+price+"원");

		}

		

		

		

		

	}

 

}