package com.hoshimachi.ex1117;

public class Exam_06 {

	public static void main(String[] args) {
		int ban[] = { 5, 1, 2, 3, 4 };
		int score[] = { 75, 90, 80, 95, 85 };
		int rank[] = new int[score.length];


		//석차구하기
		for(int x = 0; x < score.length; x++) {
			int r = 1;
			for(int y= 0; y < score.length; y++) {
				if(score[x] < score[y])
				r++;
			}
			rank[x] = r;
		}
		//출력1
		System.out.println("번호 \t 점수\t 석차");
		System.out.println();
		
		for(int z=0; z<score.length; z++) {
			System.out.println(ban[z]+"\t"+score[z]+"\t"+rank[z]);
		}
		
		// 번호순 정렬
		for (int x = 0; x < ban.length-1; x++) {// 번호  비교
			for (int y = x+1; y < ban.length; y++) {
				if (ban[x] > ban[y]) {
					int temp = ban[x];
					ban[x] = ban[y];
					ban[y] = temp;
					
					temp = score[x];
					score[x] = score[y];
					score[y] = temp;
					
					temp = rank[x];
					rank[x] = rank[y];
					rank[y] = temp;
					
				}
			}
		}
		// 출력2
		System.out.println("번호 \t 점수\t 석차");
		System.out.println();
		
		for(int z=0; z<score.length; z++) {
			System.out.println(ban[z]+"\t"+score[z]+"\t"+rank[z]);
		}

	}

}
