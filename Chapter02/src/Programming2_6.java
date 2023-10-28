import java.util.Scanner;

public class Programming2_6 {

	public static void main(String[] args) {
		int get_money;
		int rate, charge;
		int tax;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("받은 돈: ");
		get_money = sc.nextInt();
		System.out.print("상품 가격: ");
		rate = sc.nextInt();
		tax = rate/10;
		System.out.println("부가세: " + tax);
		charge = get_money - rate;
		System.out.println("잔돈: " + charge);
	}

}
