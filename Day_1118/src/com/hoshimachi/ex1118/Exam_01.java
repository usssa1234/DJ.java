package com.hoshimachi.ex1118;
/*
		 검색 	1.선형검색(Liner Search)
			- 순서구조->순차(순서)
			2.이진검색(Binary Search)
			- sort가 되어있지 않으면 쓸 수가 없다.
 */			


public class Exam_01 {

	public static void main(String[] args) {
		int[] score = {10,20,30,40,50,60,70,80,90};
		int val = 30;
		
		// 검색
		int low=0;
		int high=score.length-1;
		boolean flag = true;
		while(low<=high) {
			int m=(low+high)/2;
			if(score[m]==val) {
				System.out.println("검색 :"+ m + "번째");
				flag =false;
				break;
			}else if(score[m]>val) {
				high=m-1;
			}else {
				low=m+1;
			}
		}
		if(flag) {
			System.out.println("검색 불가 ");
		}
	}

}
