package com.jslhrd.string;

import java.util.Scanner;

public class SawonExam {

	public static void main(String[] args) {
		Sawon sa[] = new Sawon[10];
		Scanner scn = new Scanner(System.in);
		int cnt=0;
		System.out.print("사원등록 :");
		while(cnt<sa.length) {
			String input[] = scn.nextLine().split(",");
			if(input[0].equals(9999)) {
				break;
			}
		}
	}

}
