package com.jslhrd.lang;
class DD{

}
public class Exam_06 {

	public static void main(String[] args) {
		/*
		DD d1 = new DD();
		System.out.println(d1);
		 */
		String str1 = "AAAA";//
		String str2 = "AAAA";
		String str3 = new String("AAAA");//

		System.out.println("str1==str2 : "+ (str1==str2));
		System.out.println("str1==str3 : "+ (str1==str3));
		System.out.println("str1.equals(str3) :"+ (str1.contentEquals(str3)));
		/*
		byte[] bytes = {'A','A','A','A'};//
		String str4 = new String(bytes);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		 */

	}

}
