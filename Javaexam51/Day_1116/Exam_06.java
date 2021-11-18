import java.util.Arrays;

public class Exam_06 {

	public static void main(String[] args) {
		int var[] = {1,2,3,4,5};
		
		
		// 공유
		int temp[] = var;
		// 배열 하나를 var, temp 의 두개의 참조변수가 공유
		System.out.println(var + Arrays.toString(var));
		System.out.println(temp + Arrays.toString(temp));
		
		var[1] = 200;
		
		System.out.println(var + Arrays.toString(var));
		System.out.println(temp + Arrays.toString(temp));
		
		System.out.println("----------------------------------------------");
		
		// 복제
		int imsi[] = var.clone();
		System.out.println(var + Arrays.toString(var));
		System.out.println(imsi + Arrays.toString(imsi));
		
		var[1] = 2;
		
		System.out.println(var + Arrays.toString(var));
		System.out.println(imsi + Arrays.toString(imsi));
	}

}
