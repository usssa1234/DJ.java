package com.hoshimachi.ex1117;

public class Exam_05 {

	public static void main(String[] args) {
		int score[] = {70, 90, 77, 98, 88, 90};
		int rank[] = new int[score.length];
		
		for(int x=0; x<score.length; x++) {
			int r = 1;
			for(int y=0; y<score.length; y++) {
				if(score[x] < score[y]) {
					r++;
				}
			}
			rank[x] = r;
		}
		//출력
		for(int x=0; x<score.length; x++) {
			System.out.print(score[x]+"("+rank[x]+")\t");
		}
		System.out.print("\n");
		System.out.println("점수\t석차");
		for(int x=0; x<score.length;x++) {
			System.out.println(score[x]+"\t"+rank[x]);
		}
	}

}
