package com.hoshimachi.ex1126;

public class Parking {
	String carNo;
	int parkTime;
	int money;

	Parking() {
	}

	Parking(String carNo, int parkTime) {
		this.carNo = carNo;
		this.parkTime = parkTime;
		parkT();
		
	}

	// 주차요금 조건문
	public void parkT() {
		
		if (parkTime < 10) {
			money=0;
		} else if (parkTime>=10 && parkTime <= 30) {
			money = 500;
		} else{
			money = ((parkTime - 31) / 10 * 500+ 1000);
		} 
		if(money>30000)
			money=30000;
	}

	// 출력 메소드
	public void anounce() {
		
			System.out.print(carNo+"\t"+parkTime+"\t"+money+"원");
			System.out.println();
	}
}
