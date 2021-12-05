package com.hoshimachi.ss;

import java.util.Scanner;

public class Strike_01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] jum = new int[10][4];
		int tot=0;
		int ttot=0;

		// 1회~9회
		System.out.print("입력예제 :");
		for (int x = 0; x < jum.length - 1; x++) {

			jum[x][0] = scn.nextInt();
			if (jum[x][0] > 10) {
				System.out.println("입력 오류");
			}
			if (jum[x][0] == 10) {

				continue;

			}

			jum[x][1] = scn.nextInt();

			if (jum[x][0] + jum[x][1] > 10) {
				System.out.println("입력 오류");
				break;
			}
		}
		// 10회째
		jum[9][0] = scn.nextInt();
		if (jum[9][0] == 10) {
			jum[9][1] = scn.nextInt();
			jum[9][2] = scn.nextInt();

		} else {
			jum[9][1] = scn.nextInt();
			if (jum[9][0] + jum[9][1] == 10) {
				jum[9][2] = scn.nextInt();
			}

		}
		// 점수
		for (int x = 0; x < jum.length-1; x++) {

			// 둘다 아닌 경우
			jum[x][3] = jum[x][0] + jum[x][1];
			// 스트라이크인 경우
			if (jum[x][0] == 10) {
				jum[x][3] = jum[x][0] + jum[x + 1][0] + jum[x + 1][1];
			}// 스페어 처리인 경우
			else if (jum[x][0] + jum[x][1] == 10) {
				jum[x][3] = jum[x][0] + jum[x][1] + jum[x + 1][0];
			}
			// 연속 스트라이크일 경우
			if (jum[x][0] + jum[x+1][0]== 20) {
				jum[x][3] = jum[x][0] + jum[x + 1][0] + jum[x+2][0];
			}
		
			// 1~9회 총합
			tot += jum[x][3];
		}
		
		// 10회째 스트라이크인 경우
		jum[9][3] = jum[9][0]+jum[9][1];
		if (jum[9][0] == 10) {
			jum[9][3] = jum[9][0] + jum[9][1] + jum[9][2];
		}
		// 10회째 스페어 처리인 경우
		else if (jum[9][0] + jum[9][1] == 10) {
			jum[9][3] = jum[9][0] + jum[9][1] + jum[9][2];
		}
		
		//1~10회 총합
		ttot = tot + jum[9][3];
		System.out.println("출력 :" + ttot);
	}

}
