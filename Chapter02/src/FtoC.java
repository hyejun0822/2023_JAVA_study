import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {
		Scanner temp = new Scanner(System.in);
		Scanner ForC = new Scanner(System.in);
		int num;
		double change, complete;
		
		System.out.println("==============================");
		System.out.println("1. 화씨 -> 섭씨");
		System.out.println("2. 섭씨 -> 화씨");
		System.out.println("==============================");
		System.out.print("번호를 선택하시오 : ");
		num = ForC.nextInt();
		if (num == 1) {
			System.out.print("화씨온도를 입력하시오. : ");
			change = temp.nextDouble();
			complete = (5.0/9.0)*(change-32);
			System.out.println("섭씨온도는 " + complete);
		}
		else if (num == 2) {
			System.out.print("섭씨온도를 입력하시오. : ");
			change = temp.nextDouble();
			complete = (9.0/5.0)*change + 32;
			System.out.println("화씨온도는 " + complete);
		}
		else {
			System.out.println("잘못된 번호입니다.");
		}

	}

}
