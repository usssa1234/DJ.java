import java.util.Scanner;

/*
 * 정수 7개를 입력 받아서 최대, 최소, 합계, 평균을 구하여 출력
 * [입력 예시]
 * 정수 1: 97
 * 정수 2: 55
 *   ..
 * 정수 7: 85
 * [출력 예시]
 * 입력자료 : 97 55 ... 85
 * 최대값 : xx
 * 최소값 : xx
 * 합계 : xxx
 * 평균 : xxx
 */
public class Exam_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		// 입력
		int arr[] = new int[7];
		for (int t=0; t<7; t++) {
			System.out.print("정수"+(t+1)+" : ");
			arr[t] = sc.nextInt();
		}
		
		// 계산
		int max=arr[0];
		int min=arr[0];
		int sum=arr[0];
		double avg;
		
		for (int i=1; i<arr.length; i++) {
			sum += arr[i];
			if (max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]){
				min = arr[i];
			}
		}
		avg = (double)sum/arr.length;

		
		// 출력
		System.out.print("\n입력자료 : ");
		for (int val : arr) {
			System.out.print(val + " ");
		}
		
		System.out.println("\n최대값 : "+max);
		System.out.println("최소값 : "+min);
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
	}
}
