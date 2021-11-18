/*
 *  1  2  3  4  5
 *  10 9  8  7  6
 *  11 12 13 14 15
 *  20 19 18 17 16
 *  21 22 23 24 25
 */
public class Exam_01 {

	public static void main(String[] args) {
		{
			int n=0;
			for (int i=0; i<5; i++) {	// row
				int ptr=n+5;
				for (int j=0; j<5; j++) {	// col
					n++;
					if (i%2==0) {
						System.out.print(n+"\t");
					} else {
						System.out.print(ptr-- + "\t");
					}
				}
				System.out.println();
			}
		}
		
		{
			int cnt=0;
			int loop=0; // row의 시작값
			for (int x=0; x<5; x++) {
				if (loop%2==0) {	// 확인하는 loop값은 이전 row의 시작값이  된다 (loop값은 홀짝 반복됨)
									// x로 바꾸어도 동일
					loop=loop+1;
					cnt=loop;
					for (int y=0; y<5; y++) {
						System.out.print(cnt+"\t");
						cnt++;
					}
					System.out.println();
				} else {
					loop = loop + 9;
					cnt = loop;
					for (int y=0; y<5; y++) {
						System.out.print(cnt+"\t");
						cnt--;
					}
					System.out.println();
				}
			}
		}
	}

}

// 콘솔화면에서 출력은 위에서부터 아래로, 왼쪽에서 오른쪽으로 이루어진다