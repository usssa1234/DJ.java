package com.jslhrd.stringbuffer;

import java.util.Scanner;

public class Bufferex_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		StringBuffer strBuf = new StringBuffer();
		int ban;
		String bun=null;
		while(true) {
			System.out.print("10진수 입력 :");
			
			ban = Integer.parseInt(input.next());
			if(ban==-99) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			while(ban>0) {
				strBuf.append(ban%2);
				ban /=2;
			
			}
			System.out.println(strBuf.reverse());
			strBuf.delete(0, strBuf.capacity());
			
	
			
			
		
				
			
		
			
			
		}
	}

}
