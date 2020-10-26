package smg;
import java.util.Scanner; 

class SA1 {
	Scanner sc = new Scanner(System.in);
	public double balance;
	public double interestRate = 0.01;
	public String name;
	public void displayCustomer() {
		System.out.println("Customer " + name);
	}
	public void withdraw() {
		double a;
		System.out.println("What amount of money to withdraw");
		a = sc.nextDouble();
		if (balance < a) {
			System.out.println("You have not enought money");
		}else if(a < 0) {
			System.out.println("Wrong value");
		}else {
			balance = balance - a;
		}
	}
	
}

public class Project10ex1 {

	public static void main(String[] args) {
		System.out.println("");
		SA1 sa001 = new SA1();
		sa001.balance = 100;
		sa001.withdraw();
		System.out.println(sa001.balance);
	}

}
