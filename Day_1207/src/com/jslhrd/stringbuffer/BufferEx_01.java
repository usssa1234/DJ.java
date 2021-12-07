package com.jslhrd.stringbuffer;

public class BufferEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer strBuf1 = new StringBuffer();//기본 16개
		StringBuffer strBuf2 = new StringBuffer(10);// 기본16개를->10개로 변환
		StringBuffer strBuf3 = new StringBuffer("jslhrd");// jslhrd + 16개
		System.out.println("문자열 길이 : "+ strBuf1.length());
		System.out.println("문자열 길이 : "+ strBuf2.length());
		System.out.println("문자열 길이 : "+ strBuf3.length());
		System.out.println("buffer 길이 : "+ strBuf1.capacity());
		System.out.println("buffer 길이 : "+ strBuf2.capacity());
		System.out.println("buffer 길이 : "+ strBuf3.capacity());
	}

}
