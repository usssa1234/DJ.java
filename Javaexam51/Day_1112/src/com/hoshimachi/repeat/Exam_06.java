package com.hoshimachi.repeat;
/*
 *  1  2  3  4  5  6  7  8  9  10
 *  11 12 13 14 15 16 17 18 19 20
 *  21 .  .
 *  91 92 93 94 95 96 97 98 99 100
 */
import java.util.Scanner;

/*
 *  	키보드의 정수 10개를 입력받아서 
 *  	50~90 사이의 합과 평균을 구하여 출력 
 */
public class Exam_06 {

	public static void main(String[] args) {
		int n = 0;
		while(n < 100) {
			n++;
			System.out.print(n+ "\t");
			if(n%10 == 0) {
				System.out.print("\n");
			}
		}
		
			}
}





