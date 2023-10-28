import java.util.Scanner;

public class Programming2_2 {

	public static void main(String[] args) {
		Scanner MiletoKilo = new Scanner(System.in);
		double mile, kilo;
		
		System.out.print("마일을 압력하시오 : ");
		mile = MiletoKilo.nextDouble();
		kilo = (1.609) * mile;
		System.out.println(mile + "마일은 " + kilo + "킬로미터입니다.");
	}

}
