import java.util.Scanner;

/*
 * 5개의 정수를 입력 받아서 합, 평균을 구하여 출력
 * 입력 : 60
 * 입력 : 70
 * 입력 : 88
 * 입력 : 95
 * 입력 : 56
 * [출력예시]
 * 입력 값 : 60 70 88 95 56
 * 합계 : xxx
 * 평균 : xx
 */
public class Exam_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		int sum=0;
		int avg;
		for (int i=0; i<5; i++) {
			System.out.print("입력 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		avg = sum/5;
		
		System.out.print("\n입력 값 :");
		for (int val: arr) {
			System.out.print(" "+val);
		}
		System.out.println("\n합계 : "+sum);
		System.out.println("평균 : "+avg);

	}

}
