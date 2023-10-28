import java.util.Scanner;

public class Programming2_1 {

	public static void main(String[] args) {
		Scanner max_box = new Scanner(System.in);
		int orange;
		int box, left;
		System.out.print("오렌지의 개수를 입력하시오 : ");
		orange = max_box.nextInt();
		box = orange / 10;
		left = orange % 10;
		System.out.println(box + "박스가 필요하고 " + left + "개가 남습니다.");

	}

}
