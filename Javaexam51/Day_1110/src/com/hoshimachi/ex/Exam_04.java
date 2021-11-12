package com.hoshimachi.ex;

import java.util.Scanner;

/*
 *  
 */
public class Exam_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("정수 3개 입력 : ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int max = 0;
		int min = 0;
		int me = 0;

		System.out.println("입력 데이터 : " + a + "\t" + b + "\t" + c);
/*
		if (a > b) {
		
			if (a > c) {
				max = a; 
				
				if (b > c) {
					me = b;
					min = c; // a > b > c
				} else {
					me = c;
					min = b; // a > c > b
				}
			} else {// c > a > b
				max = c;
				me = a;
				min = b;
			}

		} else { // b > a
			if(b > c) {
				max = b;
				if (a > c) {
					me = a;
					min = c; // b > a > c
				}else {
					me = c;
					min = a; // b > c > a
				}
			
			}else {
				max = c;
				me = b;
				min = a; // c > b > a
			}
		}
*/
		
		if(a > b) {
			if(a > c) {
				max = a;
				if(b > c) {
					me = b;
					min = c;
				}else {
					me = c;
					min = b;
				}
			}else {
				max = c;
				me = a;
				min = b;
			}
				
			
		}else {
			if(b > c) {
				max = b;
				if(a > c) {
					me = a;
					min = c;
				}else {
					me = c;
					min = a;
				}
			}else {
				max = c;
				me = b;
				min = a;
			}
		}
		
		System.out.println(max);
		System.out.println(me);
		System.out.println(min);

	}
}
