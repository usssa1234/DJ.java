package com.hoshimachi.ex1118;

public class Exam_04 {
	// 이차행렬 계산 하는 방법
	public static void main(String[] args) {
		int val[][] = new int[5][5];
		int cnt=0;
		for(int x=0; x<val.length-1; x++) {
			for(int y=0; y<val[x].length-1; y++) {
				cnt++;
				val[x][y] =cnt;
				val[x][4] = val[x][4]+val[x][y];
				val[4][y] = val[4][y]+val[x][y];
				val[4][4] = val[4][4]+val[x][y];
			}
		}
		//출력
		for(int x=0; x<val.length; x++) {
			for(int y=0; y<val[x].length; y++) {
				System.out.print(val[x][y]+"\t");
			}
			System.out.println();
		}

	}

}
