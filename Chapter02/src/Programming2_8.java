import java.util.Scanner;

public class Programming2_8 {

	public static void main(String[] args) {
		int weight;
		int speed;
		double energy;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물체의 무게를 입력하시오(킬로그램): ");
		weight = sc.nextInt();
		System.out.print("물체의 속도를 입력하시오.(미터/초): ");
		speed = sc.nextInt();
		energy = 0.5 * weight * speed * speed;
		System.out.println("물체는 " + energy + " (줄)의 에너지를 가지고 있다.");
	}

}