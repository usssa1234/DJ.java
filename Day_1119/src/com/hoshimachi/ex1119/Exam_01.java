package com.hoshimachi.ex1119;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		int score[][] = new int[10][5];// 번호 국어 영어 수학 총점
		String name[] = new String[10];// 이름
		Scanner scn = new Scanner(System.in);
		int cnt;
		for (cnt = 0; cnt < 10; cnt++) {
			System.out.println("학생등록 : ");
			score[cnt][0] = scn.nextInt();
			if(score[cnt][0]==0) {
				break;
			}
			name[cnt] = scn.next();
			score[cnt][1] = scn.nextInt();//국어
			score[cnt][2] = scn.nextInt();//영어
			score[cnt][3] = scn.nextInt();//수학
			score[cnt][4] = score[cnt][1]+score[cnt][2]+score[cnt][3];//총점
			
			
		}
		// 데이터 출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점");
		for(int x=0; x<cnt; x++) {
			System.out.print(score[x][0]+"\t"+name[x]+"\t");
			for(int y=1; y<score[x].length; y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
	}

}
