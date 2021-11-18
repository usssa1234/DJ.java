package com.hoshimachi.exex;
/*
 * 1 ~ 100 까지의 홀수 합
 */
public class Exam_03 {

	public static void main(String[] args) {
		int sum=0;
		for(int x=1; x<=100; x++) {
			if(x%2 == 1) {
				sum+=1;
			}else {
				continue;
			}
			
		}
		System.out.println("홀수 합 :"+sum);
	}

}
