package com.jslhrd.stringbuffer;

import java.util.Scanner;

public class BufferEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		StringBuffer strBuf = new StringBuffer();
		int ban;
		while(true) {
			System.out.print("10진수 입력 :");
			strBuf.append("");
			ban = Integer.parseInt(input.next());
			if(ban==-99) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			String binaryString = Integer.toBinaryString(ban);
			System.out.println(binaryString);
			
			
			
			
		}
	}

}
