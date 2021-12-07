package com.jslhrd.lang;

import java.util.Arrays;

public class Exam_04 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int tmp[] = arr;// 주소값만 넘겨주기에 공유상태이다.
		System.out.println("arr :" + Arrays.toString(arr));
		System.out.println("tmp :" + Arrays.toString(tmp));
		System.out.println("------------");
		tmp[0] = 100;
		System.out.println("arr :" + Arrays.toString(arr));
		System.out.println("tmp :" + Arrays.toString(tmp));
		System.out.println("------------");
		int arr2[] = arr.clone(); // 복제

	}

}
