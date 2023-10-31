class BankAccount	{
	int accountNumber;
	String owner;
	int balance;
	
	void deposit(int amount)	{	balance += amount;	}
	void withdraw(int amount)	{	balance -= amount;	}
	
	@Override
	public String toString() {
		return "현재 잔액은 " + balance + "입니다.";
	}
}
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		myAccount.deposit(10000);
		System.out.println(myAccount);
		myAccount.withdraw(8000);
		System.out.println(myAccount);
	}

}
