import java.util.Scanner;

public class RockPaperScissor {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	
	public static void main(String[] args) {
		int human;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2): ");
		human = sc.nextInt();
		
		
		int computer = (int)(Math.random()*3);
		if(human == computer) {
			System.out.println("인간: " + human + " 컴퓨터: " + computer + " 인간과 컴퓨터가 비겼음");
		}else if(human == (computer + 1)%3) {
			System.out.println("인간: " + human + " 컴퓨터: " + computer + " 인간 승리");
		}else {
			System.out.println("인간: " + human + " 컴퓨터: " + computer + " 컴퓨터 승리");
		}

	}

}
