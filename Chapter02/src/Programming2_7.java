import java.util.Scanner;

public class Programming2_7 {

	public static void main(String[] args) {
		double radius, volume;
		final double PI = 3.141592;
		Scanner r = new Scanner(System.in);
		System.out.print("구의 반지름: ");
		radius = r.nextDouble();
		volume = (4.0/3.0)*PI*(radius*radius*radius);
		System.out.println("구의 부피: " + volume);
	}

}
