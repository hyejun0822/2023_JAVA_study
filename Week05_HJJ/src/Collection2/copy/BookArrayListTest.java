package Collection2.copy;

import java.util.Scanner;

public class BookArrayListTest {

	public static void main(String[] args) {
		BookArrayList bookArrayList = new BookArrayList();
		Scanner scanner = new Scanner(System.in);
		
		Book book1 = new Book(0001, "파우스트");
		Book book2 = new Book(0002, "황무지");
		Book book3 = new Book(0003, "변신");
		Book book4 = new Book(0004, "픽션들");
		Book book5 = new Book(0005, "톨스토이");
		
		bookArrayList.addBook(book1);
		bookArrayList.addBook(book2);
		bookArrayList.addBook(book3);
		bookArrayList.addBook(book4);
		bookArrayList.addBook(book5);
		
		bookArrayList.showAllBook();
		
		System.out.println("추가할 책의 아이디를 입력하세요:");
		int insertId = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("추가할 책의 이름을 입력하세요:");
		String insertName = scanner.nextLine();
		
		 System.out.println("추가할 위치(인덱스)를 입력하세요:");
	     int insertIndex = scanner.nextInt();
	     scanner.nextLine();

		
		Book newBook = new Book(insertId, insertName);
		bookArrayList.insertBook(insertIndex, newBook);
		
		bookArrayList.showAllBook();
		
		scanner.close();
	}

}
