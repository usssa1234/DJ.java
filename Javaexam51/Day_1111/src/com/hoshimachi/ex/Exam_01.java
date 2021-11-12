package com.hoshimachi.ex;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 자료 : ");
		String na = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		int sum = 0;
		int avg = 0;

		sum = kor + eng + mat;
		avg = sum / 3;

		if (kor >= 40 && eng >= 40 && mat >= 40) {
			if (avg >= 60) {
				System.out.println("이름 : " + na);
				System.out.println("평균 : " + avg);
				System.out.println("판정 : 합격");

			} else {
				System.out.println("이름 : " + na);
				System.out.println("평균 : " + avg);
				System.out.println("판정 : 불합격");
				System.out.println("불합격 사유 : 평균미만");
			}

		} else {

			System.out.println("이름 : " + na);
			System.out.println("평균: " + avg);
			System.out.println("판정: 불합격");
			System.out.println("불합격사유: 과락");
		}

	}

}
