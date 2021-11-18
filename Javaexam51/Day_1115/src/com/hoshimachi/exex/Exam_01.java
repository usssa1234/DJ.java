package com.hoshimachi.exex;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score;
		while(true) {
			System.out.print("점수입력:");
				score = scn.nextInt();
				if(score>=1 && score <=100) {
					break;
				}
		}
		int max = score;
		int min = score;
		int sum = score;
		int cnt = 1;
	
		sum = sum - max-min;
		double ave = (int)(sum/5.*10+0.5)/10;
		
		String hak="D";
		if(ave>=87) {
			hak="A";
		}else if(ave>=72) {
			hak="B";
		}else if(ave>=55) {
			hak="C";
		}
		System.out.println("최대점수 : "+ max);
		System.out.println("최소점수 : "+ min);
		System.out.println("합계 : "+ sum);
		System.out.println("평균 : "+ ave+"("+hak+")");
	}

}
