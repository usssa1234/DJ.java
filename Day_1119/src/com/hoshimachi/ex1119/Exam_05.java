package com.hoshimachi.ex1119;

import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int apt[][] = new int[11][8];
		int cnt;
		while(true) {
			
			System.out.print("등록 : ");
			int dong = scn.nextInt();
			if(dong==0) {
				break;
			}
			
			scn.next();
			int age = scn.nextInt()/10;
			if(age>=60) {
				age=6;
			}
			apt[dong-1][age]++;
			apt[dong-1][apt[0].length-1]++;//합계 줄
			apt[apt.length-1][age]++;
			apt[apt.length-1][apt[0].length-1]++;//합계 행
			
		}
		System.out.println("동\t0~9\t10~19\t20~29\t30~39\t40~49\t50~59\t60이상\t합계");
		for(int x=0; x<apt.length; x++) {
			System.out.print((x+1)+"\t");
			for(int y=0; y<apt.length; y++) {
				System.out.println(y+"\t");
			}
		}
		
	}

}
