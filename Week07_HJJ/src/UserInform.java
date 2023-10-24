import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UserInform {

	public static void main(String[] args) throws IOException{
		int num2;
		String search;
		String num, name, tel, email;
		Scanner scan = new Scanner(System.in);
		PrintWriter in = new PrintWriter(new FileWriter("user.txt"));
		
		while(true) {
			System.out.print("번호 : ");
			num = scan.next();
			System.out.print("이름 : ");
			name = scan.next();
			System.out.print("전화번호 : ");
			tel = scan.next();
			System.out.print("이메일 : ");
			email = scan.next();
			
			in.print(num + "," + name + "," + tel + "," + email + "" );
			in.flush();
			
			System.out.print("입력이 끝났으면 1, 계속 하려면 0 : ");
			num2 = scan.nextInt();
			
			if (num2 == 1)
				break;
			else if (num2 == 0)
				continue;
		}
		
		in.close();
		
		System.out.println("검색할 번호를 입력하세요 : ");
		String searchNum = scan.next();
		
		try( BufferedReader reader = new BufferedReader(new FileReader("user.txt"));
				PrintWriter out = new PrintWriter (new FileWriter("search.txt"))){
			String line;
			while((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if(parts.length >= 4 && parts[0].equals(searchNum)) {
					out.println("번호 : " + parts[0]);
                    out.println("이름 : " + parts[1]);
                    out.println("전화번호 : " + parts[2]);
                    out.println("이메일 : " + parts[3]);
					out.println();
				}
			}
		}

	}

}