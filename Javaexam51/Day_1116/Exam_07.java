// 메소드 사용법
public class Exam_07 {

	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("a:"+a+" b:"+b);
		swap(a,b);	// Call by Value
		System.out.println("a:"+a+" b:"+b);
	}
	
	static void swap(int a, int b) {
		int c = a;
		a = b;
		b = c;
	}
}
