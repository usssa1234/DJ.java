import java.util.Arrays;

public class Exam_03 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};	// 배열 선언과 동시에 명시적 초기화
//		int arr2[] = new int[] {1,2,3,4,5}; // 이것과 동일하면 new int[] 가 생략된 형태
		
		System.out.println(Arrays.toString(arr) + "\n"); // 배열값 확인방법  [값1, 값2, 값3 ... ] 리스트 방식
		
		for (int val : arr) {	// 향상된 for문
			System.out.print(val + " ");
		}
	}

}
