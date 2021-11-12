package com.hoshimachi.ex;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력 : ");
		String click = scanner.next();
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		
		switch(click) {
		case "+":
			System.out.println(val1+"+"+val2+"="+(val1+val2));
			break;
		case "-":
			System.out.println(val1+"-"+val2+"="+(val1-val2));
			break;
		case "*":
			System.out.println(val1+"*"+val2+"="+(val1*val2));
			break;
		case "/":
			System.out.println(val1+"/"+val2+"="+(val1/val2));
			break;
		case "%":
			System.out.println(val1+"%"+val2+"="+(val1%val2));
			break;
		default:
			break;
			
		}
	}

}
