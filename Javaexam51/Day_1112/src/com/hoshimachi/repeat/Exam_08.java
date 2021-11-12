package com.hoshimachi.repeat;

import java.util.Scanner;

/*
 * 
 */
// *****EOF체크******
public class Exam_08 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt = 0;
		int sum = 0;
		int score;
		System.out.println("자료 입력 :");
		while(true) {
			score = scn.nextInt();
			if(score == -99) {
				break;				
			}
			cnt++;
			sum += score;
		}
		System.out.println("sum ="+sum);
		System.out.println("avg ="+(double)sum/cnt);
	}

}
