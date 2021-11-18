/*
 *  화폐매수
 */
public class Exam_10 {

	public static void main(String[] args) {
		int money[] = {50000, 10000, 5000, 1000
				      , 500, 100, 50, 10, 5, 1};
		int pay = 278957;
		
		for (int i=0; i<money.length; i++) {
			System.out.println(money[i]+"원 : "+pay/money[i]+"개");
			pay %= money[i];
		}
		
	}

}
