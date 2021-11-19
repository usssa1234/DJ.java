package com.hoshimachi.ex1119;

import java.util.Scanner;

public class Exam_06 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cnt;//입력 받은 학생수

		int gak[][] = new int[10][11];// 전체

		for (cnt = 0; cnt < gak.length; cnt++) {// 번호10개
			System.out.print("학생등록 :");
			gak[cnt][0] = scn.nextInt();
			if (gak[cnt][0] == 0) {//번호가 0이면 종료
				break;
			}
			gak[cnt][1] = scn.nextInt();// 점수1
			gak[cnt][2] = scn.nextInt();// 점수2
			gak[cnt][3] = scn.nextInt();// 점수3
			gak[cnt][4] = scn.nextInt();// 점수4
			gak[cnt][5] = scn.nextInt();// 점수5

			int max = gak[cnt][1];
			int min = gak[cnt][1];
			int sum = gak[cnt][1];
			for (int x = 2; x < 6; x++) {

				if (max < gak[cnt][x]) {
					max = gak[cnt][x];
				} else if (min > gak[cnt][x]) {
					min = gak[cnt][x];
				}
				sum+=gak[cnt][x];
			}
			gak[cnt][6] = max;
			gak[cnt][7] = min;
			gak[cnt][8] = sum-max-min;
			gak[cnt][9] = gak[cnt][8] / 3;

		}
		// 1출력
		System.out.println("번호\t점수1\t점수2\t점수3\t점수4\t점수5\t최대점수\t최소점수\t합계\t평균");
		for (int x = 0; x < cnt; x++) {
			
			for (int y = 0; y < 10; y++) {
				System.out.print(gak[x][y] + "\t");
			}
			System.out.println();
		}
		//순위( 비교값을 주목 )
		
		for(int x=0; x<cnt; x++) {
			int r = 1;
			for(int x2=0; x2<cnt; x2++) {
				if(gak[x][8] < gak[x2][8]) {
					r++;
				}
			}
			gak[x][10] = r;
		}
		
		//sort
		for(int x=0; x<cnt-1; x++) {
			for(int y=x+1; y<cnt; y++) {
				if(gak[x][9] > gak[y][9]) {
					for(int k=0; k<gak[x].length; k++) {
						
						int temp = gak[x][k];
						gak[x][k] = gak[y][k];
						gak[y][k] = temp;
					}
				}
			}
		}
		
		// 2출력
		System.out.println("번호\t점수1\t점수2\t점수3\t점수4\t점수5\t최대점수\t최소점수\t합계\t평균\t순위");
		for (int x = 0; x < cnt; x++) {
			
			for (int y = 0; y < gak[x].length; y++) {
				System.out.print(gak[x][y] + "\t");
			}
			System.out.println();
		}
	}

}
