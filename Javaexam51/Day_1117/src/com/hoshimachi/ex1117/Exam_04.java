package com.hoshimachi.ex1117;
/*
 *  1차원 배열을 이용한 오름차순, 내리차순 정렬 법
 *  거품정렬(bubble sort)(일부만 해도 종료가 될 경우 종료시키는 정렬기법)
 */
public class Exam_04 {
	public static void main(String[] args) {
		int score[] = {90,88,95,84,80,78,50,77};
			System.out.print("\n");
		
		//정렬
		for(int x=0; x<score.length; x++) {
			boolean flag = false;	
			for(int y=0; y<score.length-x-1; y++) {
				if(score[y]>score[y+1]) {
					int imsi = score[y];
					score[y] = score[y+1];
					score[y+1] = imsi;
					flag =false;
				}
			}
			if(flag) {
				break;
			}
		}
		System.out.print("Sort Data : ");
		for(int x : score) {
			System.out.print(x + "\t");
		}
		System.out.print("\n");
		}
	
}
