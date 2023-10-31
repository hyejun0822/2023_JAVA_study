import java.util.Scanner;

public class MiniProject1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int guess, count = 0;
		int answer = (int)(Math.random()*1000000);
		do {
			System.out.print("정답을 추측하여 보시오: ");
			guess = sc.nextInt();
			if(guess < answer) {
				System.out.println("제시한 정수가 낮습니다.");
				count++;
			}else if(guess > answer) {
				System.out.println("제시한 정수가 높습니다.");
				count++;
			}
		}while(guess != answer);
		System.out.println("축하합니다. 시도횟수 = " + count);
	}

}