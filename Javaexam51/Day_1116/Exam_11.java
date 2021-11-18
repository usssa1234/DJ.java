import java.util.Scanner;

/*
 * 7개의 데이터를 입력 받아서 평균에 가장 가까운 값을 출력
 * [입력 예시]
 * 입력 : 79 90 0 87 -9 77 56 45 78 56 78
 * -> 입력자료가 1~100이 아니면 입력자료로 사용하지 않음
 * 
 * [출력 예시]
 * 입력 자료 : 79 80 87 77 56 45 78
 * 평균 : 75
 * 평균에 가장 가까운 점수 : 77
 */
public class Exam_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력
		int[] score = new int[7];
		int cnt=0;	// 현재 입력받은 올바른 데이터 개수
		
		System.out.print("입력 : ");
		while (cnt<7) {
			int s = sc.nextInt();
			if (1<=s && s<=100) {
				score[cnt++] = s;
			}
		}
		
		
		// 계산
		
		// 1) 합계
		int sum=0;
		for (int s : score) {
			sum += s;
		}
		
		// 2) 평균
		double avg = (double)sum/cnt;
		
		
		// 3) 평균으로부터 가장 가까운 값 찾기
		double minDis=abs(score[0]-avg); // 평균으로부터 가장 작은 차이
		int minDisVal = score[0]; // 위 차이를 만드는 값
		for (int i=1; i<cnt; i++) {
			double tmpDis = abs(score[i]-avg);
			if (minDis > tmpDis) {
				minDis = tmpDis;
				minDisVal = score[i];
			}
		}
		
		// 출력
		System.out.print("\n입력 자료 :");
		for (int s : score) {
			System.out.print(" "+ s);
		}
		
		System.out.println("\n평균 : "+avg);
		System.out.println("평균에 가장 가까운 점수 : "+minDisVal);
	}
	
	static double abs(double d) {
		return (d<0)? -d:d;
	}

}
