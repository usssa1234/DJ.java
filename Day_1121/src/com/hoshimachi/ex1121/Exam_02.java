package com.hoshimachi.ex1121;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int student[][] = new int[20][3];
		int cnt;
		for (cnt = 0; cnt < student.length; cnt++) {
			System.out.print("등록 : ");
			student[cnt][0] = scn.nextInt();// 반
			if (student[cnt][0] == 0) {
				break;
			}
			student[cnt][1] = scn.nextInt();// 번호
			student[cnt][2] = scn.nextInt();// 체중

		}

		System.out.println("반\t번호\t체중");
		System.out.println(student[0][0]+"\t"+student[0][1]+"\t"+student[0][2]);
		int ban = student[0][0];
		int max = student[0][2];//최대값
		int min = student[0][2];//최소값
		for(int x=1; x<cnt; x++) {
			if(ban==student[x][0]) {
				System.out.print(" "+"\t"+student[x][1]+"\t"+student[x][2]);
			}else {
				System.out.print(student[x][0]+"\t"+student[x][1]+"\t"+student[x][2]);
				ban = student[x][0];
			}
			//max min 구하기
		}
		
	}

}
