import java.util.Scanner;

public class Programming2_4 {

	public static void main(String[] args) {
		int time;
		int distance;
		Scanner sc = new Scanner(System.in);
		System.out.print("시간간격을 입력하시오.(단위: 초) : ");
		time = sc.nextInt();
		distance = time * 340;
		System.out.println("번개가 발생한 곳까지의 거리 : " + distance + "m");
	}

}