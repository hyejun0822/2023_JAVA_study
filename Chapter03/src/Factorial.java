import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		long fact = 1;
		int n;
		
		System.out.print("정수를 입력하시오: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			fact *= i;
		}
		
		System.out.println(n + "!은 " + fact + "입니다.");
	}

}
