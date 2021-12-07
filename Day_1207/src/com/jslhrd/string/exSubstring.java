package com.jslhrd.string;

public class exSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date ="2021-12-07";
		String y = date.substring(0,4);
		String m = date.substring(5,7);
		String d = date.substring(8); //8부터 끝까지
		double dt = 356.76345;
		String str = String.format("%f", dt);
		System.out.println(str);
		str = String.format("%5.1f", dt);
		System.out.println(str);
	}

}
