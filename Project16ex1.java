package smg;
import java.util.Scanner;

public class Project16ex1 {

	public static void main(String[] args) {
		boolean close = false;
		Scanner sc = new Scanner(System.in);
		Account[] accounts = new Account[10];
		for (int i = 0; i < 10; i++) {
			accounts[i] = new Account ();
			accounts[i].setBalance(100);
			accounts[i].setID(i);
		}
		int id = 10;
		int choice = 10;
		int withdraw = 1000000;
		int deposit = 0;
		while (choice != 100) {
			close = false;
			id = 10;
			while (id > 9) {
				System.out.println("Enter an ID.");
				id = sc.nextInt();
			}
			while (!close) {
				System.out.println("Main menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
				System.out.println("Enter a choice");
				choice = sc.nextInt();
				if (choice == 1) {
					System.out.println(accounts[id].getBalance());
				}
				if (choice == 2) {
					while (accounts[id].getBalance() < withdraw) {
						System.out.println("How much to withdraw");
						withdraw = sc.nextInt();
					}
					accounts[id].withdraw(withdraw);
				}
				if (choice == 3) {
					System.out.println("How much to deposit");
					deposit = sc.nextInt();
					accounts[id].deposit(deposit);
				}
				if (choice == 4) {
					close = true;
				}
			}
		}
	}

}
