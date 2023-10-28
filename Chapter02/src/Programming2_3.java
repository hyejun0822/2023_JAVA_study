import java.util.Scanner;

public class Programming2_3 {

	public static void main(String[] args) {
		int x, y;
		int sum, sub, times;
		double aver;
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		System.out.print("x : ");
		x = a.nextInt();
		System.out.print("y : ");
		y = b.nextInt();
		sum = x + y;
		sub = x - y;
		times = x * y;
		aver = (double)sum/2.0;
		
		System.out.println("두 수의 합 : " + sum);
		System.out.println("두 수의 차 : " + sub);
		System.out.println("두 수의 곱 : " + times);
		System.out.println("두 수의 평균 : " + aver);
		System.out.println("큰 수 : " + ((x > y) ? x : y));
		System.out.println("작은 수 : " + ((y > x) ? x : y));
	}

}
