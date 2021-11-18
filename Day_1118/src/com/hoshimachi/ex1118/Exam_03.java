package com.hoshimachi.ex1118;

public class Exam_03 {

	public static void main(String[] args) {
		//앞에는 Row(ex:5) 뒤는 Col(ex:3) 줄 /행
//									
		//arr[][]= new [2][3] 	ㅁㅁㅁ
//								ㅁㅁㅁ
		int score[][] = new int[5][5];
		int cnt=0;
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score[x].length; y++) {
				cnt++;
				score[x][y] =cnt;
			}
		}
		for(int x=0; x<score.length; x++) {
			for(int y=0; y<score[x].length; y++) {
				System.out.print(score[x][y]+"\t");
			}
			System.out.println();
		}
	}
}
