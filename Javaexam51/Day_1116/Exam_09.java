import java.util.Scanner;

/* (1000이하의)
 * 10진수를 2진수 변환
 * (배열)
 */
public class Exam_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("(1000이하의) 10진수 : ");
		int dec = sc.nextInt();
		int bin[] = new int[10];
		int len=0;
		
		int tmp = dec;
		
		while (dec>0) {
			bin[len++] = dec%2;
			dec /= 2;
		}
		dec = tmp;
		System.out.println("10진수 : "+dec);
		System.out.print("2진수 : ");
		for (int i=len-1; i>=0; i--) {
			System.out.print(bin[i]);
		}
	}

}
