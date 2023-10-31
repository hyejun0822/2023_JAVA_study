import java.util.Scanner;

public class Nested {

	public static void main(String[] args) {
		int number;
		
		Scanner pm = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		number = pm.nextInt();
		if (number == 0) {
			System.out.println("입력한 정수는 0입니다.");
		}else if (number > 0) {
			System.out.println("입력한 정수는 양수입니다.");
		}else {
			System.out.println("입력한 정수는 음수입니다.");
		}

	}

}
