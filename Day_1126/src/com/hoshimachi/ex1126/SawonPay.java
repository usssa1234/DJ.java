package com.hoshimachi.ex1126;

public class SawonPay {
	String name;
	int pay;
	int money[] = new int[10];
	
	public SawonPay() {}
	public SawonPay(String name, int pay) {
		this.name=name;
		this.pay=pay;
		//화폐매수 계산 메소드 호출
		
		MoneyPay();
	}
	//화폐매수 계산 구현
	private void MoneyPay() {
		int won[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int temp=pay;
		for(int i=0; i<won.length; i++) {
			money[i]=temp/won[i];
			 temp %= won[i];
			
		}
	}
	//출력메소드 구현
	public void sawonPayPrint() {
		System.out.print(name+"\t"+pay+"\t");
		for(int x=0; x<10; x++) {
			System.out.print(money[x]+"\t");
		}
		System.out.println();
	}
}

