
public class Exam_02 {

	public static void main(String[] args) {
		int [] arr=new int[5];
		System.out.println(arr);	// toString()를 실행하여 참조값(주소)을 보여준다
//		System.out.println(arr[66]);	// ArrayIndexOutOfBoundsException: 66
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		
		
		for (int i=0; i<arr.length; i++) {	// arr.length 배열의 길이
			System.out.print(arr[i] + " ");
		}
	}

}
