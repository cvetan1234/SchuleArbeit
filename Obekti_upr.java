package smg;

class SavingsAccount{
	public double balance;
	public double interestRate = 0.01;
	public String name;
	
	public void displayCustomer() {
		System.out.println("Customer " + name);
	}
	
}

public class Obekti_upr {
	public static void main(String[] args) {
		SavingsAccount sa001 = new SavingsAccount();
		System.out.println(sa001.interestRate);

	}
}

