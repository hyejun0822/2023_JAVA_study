import java.util.Scanner;

public class Programming3_2 {

	public static void main(String[] args) {
		int a, b;
		double c;
		String d;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산을 입력하세요: ");
		d = sc.next();
		System.out.print("피연산자 2개를 입력하세요: ");
		a = sc.nextInt(); b = sc.nextInt();
		
		if (d.equals("+")) {
			c = a + b;
			System.out.println(a + " " + d + " " + b + " = " + c);
		}
		else if (d.equals("-")) {
			c = a - b;
			System.out.println(a + " " + d + " " + b + " = " + c);
		}
		else if (d .equals("*")) {
			c = a * b;
			System.out.println(a + " " + d + " " + b + " = " + c);
		}
		else if (d.equals("/")) {
			if (b > 0) {
				c = a / b;
				System.out.println(a + " " + d + " " + b + " = " + c);
			}else {
				System.out.println("분모가 0인 나눗셈은 불가합니다.");
			}
		}
	}

}
