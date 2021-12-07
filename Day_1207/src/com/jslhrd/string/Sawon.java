package com.jslhrd.string;

public class Sawon {
	private String bun;
	private String name;
	private String birth;//20020702
	private String birth2;//2002년07월02일
	private int age;
	private String gen;
	private int money;
	
	Sawon(){}
	Sawon(String bun,String name, String birth,String birth2,int age,String gen,int money){
		this.bun=bun;
		this.name=name;
		this.birth=birth;
		this.birth2=birth2;
		this.age=age;
		this.gen=gen;
		this.money=money;
		
	}
	
	public String getBun() {
		return bun;
	}
	public void setBun(String bun) {
		this.bun = bun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getBirth2() {
		return birth2;
	}
	public void setBirth2(String birth2) {
		this.birth2 = birth2;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		String gen="여";
		if(this.gen.equals("M")) {
			gen="남";
		}
		return "Sawon [bun=" + bun + ", name=" + name + ", birth2=" + birth2 + ", age=" + age
				+ ", gen=" + gen + ", money=" + money + "]";
	}
	
}
