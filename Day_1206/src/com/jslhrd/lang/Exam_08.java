package com.jslhrd.lang;

import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		// 단어입력 : Apple Seoul Korea end
		char[] str = new char[26];
		int bin[] = new int[26];
		Scanner scn = new Scanner(System.in);

	
	
		char h = 65;
		for (int x = 0; x < str.length; x++) {
			str[x] = h;
			h++;

		}
		while (true) {
			System.out.print("입력  :");
			String str1 = scn.next().toUpperCase();
			if (str1.equalsIgnoreCase("end")) {
				break;
			}

			for (int x = 0; x < str1.length(); x++) {// 쪼개기
				char ch = str1.charAt(x);
				for (int y = 0; y < str.length; y++) {
					if (ch == str[y]) {
						
						bin[y]++;
					}
				}
				}
			}
			for (int z = 0; z < bin.length; z++) {
			System.out.println(str[z] + ":" + bin[z]);
		}

	}

}
