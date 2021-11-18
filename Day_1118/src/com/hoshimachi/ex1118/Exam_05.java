package com.hoshimachi.ex1118;

public class Exam_05 {
	// 이차행렬 계산 하는 방법
	public static void main(String[] args) {
		int val[][] = new int[5][5];
		int cnt = 0;
		
		
		
		/*//@3
		 * for(int x=0; x<val.length; x++) { for(int y=val.length-1-x; y<val.length;
		 * y++) { cnt++; val[x][y] =cnt; } }
		 */
		//@4
		for (int x = 0; x < val.length; x++) {
			if (x % 2 == 0) {
				for (int y = 0; y < val.length; y++) {
					cnt++;
					val[x][y] = cnt;
				}
			} else {
				for (int y = val.length - 1; y >= 0; y--) {
					cnt++;
					val[x][y] = cnt;
				}
			}
		}
		// 출력

		for (int x = 0; x < val.length; x++) {
			for (int y = 0; y < val[x].length; y++) {
				System.out.print(val[x][y] + "\t");
				val[x][y] = 0;
			}
			System.out.println();
		}
	}

}
