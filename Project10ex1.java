package smg;
import java.util.Scanner; 

public class Project10ex1 {

	public static void main(String[] args) {
		System.out.println("");
		SA1 sa001 = new SA1();
		sa001.balance = 100;
		sa001.withdraw();
		System.out.println(sa001.balance);
	}

}
