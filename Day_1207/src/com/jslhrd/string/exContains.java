package com.jslhrd.string;

public class exContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names="aaaa bbbb cccc dddd";
		String name ="dddd";
		boolean bool = names.contains(names);
		if(bool) {
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}
	}

}
