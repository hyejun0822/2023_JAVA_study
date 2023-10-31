import java.util.Scanner;

public class Programming3_1 {

	public static void main(String[] args) {
		int num;
		String eng;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		num = sc.nextInt();
		switch(num) {
		case 1:		eng = "ONE";		break;
		case 2:		eng = "TWO";		break;
		case 3:		eng = "THREE";		break;
		case 4:		eng = "FOUR";		break;
		case 5:		eng = "FIVE";		break;
		case 6:		eng = "SIX";		break;
		case 7:		eng = "SEVEN";		break;
		case 8:		eng = "EIGHT";		break;
		case 9:		eng = "NINE";		break;
		default:	eng = "OTHER";		break;
		}
		System.out.println(eng);
	}

}
