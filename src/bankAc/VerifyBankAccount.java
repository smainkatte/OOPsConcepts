package bankAc;

public class VerifyBankAccount {

	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount("John Xing", 500);
		bankAccount.withdraw(400);
		bankAccount.deposit(1500);
		bankAccount.withdraw(1000);
		System.out.println("Account Holder : " + bankAccount.getOwner());
		System.out.println("Current Account Balance is : $" + bankAccount.getBalance());
	}

}
