package com.hoshimachi.ex1207;

import java.util.Date;

public class Member {
	Date date = new Date();
	private String name;
	private String ho;
	private String phone;
	private String gen;
	private int age;	
	
	public Member() {
	}
	public Member(String name, String ho, String phone, String gen, int age){
		this.name=name;
		this.ho=ho;
		this.phone=phone;
		this.gen=gen;
		this.age=age;
		replaceMen();
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	// 성별 체크
	private void replaceMen() {
		//성별 추출
		String gen = ho.substring(7).trim();
		String gen2 = String.valueOf(ho.charAt(ho.indexOf("-")+1));
		// 년도추출
		String year = ho.substring(0, 2);
		
		//성별전환 및 나이추출
		if("1256".contains(gen)) {//1990
			age = 2021-(1900+Integer.parseInt(year));
			if("15".contains(gen)) {
				gen="남";
			}else {
				gen="여";
			}
		}
		if(
	}	
		public void checkGen() {
			char ch = ho.charAt(7);
			String gen= "여";
			if(gen.equals("1")) {
				gen = "남";	
			}else if(gen.equals("3")) {
				gen = "남";
			}else if(gen.equals("5")) {
				gen = "남";
			}else if(gen.equals("7")) {
				gen = "남";
			}else {
				gen = "여";
			}
		}
	
	// 나이 계산
		
		
	@Override
	public String toString() {
		
		return "Member [name=" + name + ", ho=" + ho + ", phone=" + phone + ", gen=" + gen + ", age=" + age + "]";
	}
	
	
	
}
