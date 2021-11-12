package com.hoshimachi.ex;

import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//((int)(a*100+0.5))/100
		System.out.print("입력 자료 : ");
		String na = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		int tot;
		double avg;
		tot = kor+eng+mat;
		avg = (int)(tot/3.*100+0.5)/100.;
		//(((int)(tot*100+0.5)/100))/3;
		
		System.out.println("이름 : "+na);
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
		
		
		if(avg >= 90) {
			System.out.println("학점 : A");
		}else if(avg >= 80) {
			System.out.println("학점 : B");
		}else if(avg >= 70) {
			System.out.println("학점 : C");
		}else if(avg >= 60) {
			System.out.println("학점 : D");
		}else {
			System.out.println("학점 : F");
		}
		if(avg >= 70) {
			System.out.println("판정 : PASS");
		}else {
			System.out.println("판정 : NoPass");
		}
		
	}

}
