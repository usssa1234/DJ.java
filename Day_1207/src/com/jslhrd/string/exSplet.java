package com.jslhrd.string;

public class exSplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1, aaaa, 90, 80, 90";
		String hak[] = str.split(" ");
		System.out.println("갯수 : "+ hak.length);
		for(int x=0; x<hak.length; x++) {
			System.out.println(hak[x]);
		}
		
	}
	

}
