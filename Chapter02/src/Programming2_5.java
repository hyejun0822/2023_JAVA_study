import java.util.Scanner;

public class Programming2_5 {

	public static void main(String[] args) {
		String drive, directory, file, extention;
		Scanner dri = new Scanner(System.in);
		Scanner dir = new Scanner(System.in);
		Scanner f = new Scanner(System.in);
		Scanner exten = new Scanner(System.in);
		
		System.out.print("드라이브 이름: ");
		drive = dri.nextLine();
		System.out.print("디렉터리 이름: ");
		directory = dir.nextLine();
		System.out.print("파일 이름: ");
		file = f.nextLine();
		System.out.print("확장자: ");
		extention = exten.nextLine();
		
		System.out.println("완전한 이름은 "+ drive + ":" + directory + file + "." + extention);
	}

}
