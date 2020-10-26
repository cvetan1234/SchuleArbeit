package smg;
import java.util.Scanner;
import java.util.Random;
public class Project9ex1 {
	static int Method() {
		Random rand = new Random();
		int zar1 = rand.nextInt(6);
		zar1++;
		int zar2 = rand.nextInt(6);
		zar2++;
		System.out.println("Zar1: " + zar1 + "\n" + "Zar2: " + zar2 + "\n" +"Sum: " + (zar1 + zar2));
		System.out.println("");
		return (zar1+zar2);
	}
	public static void main(String[] args) {
		int point;
		char b = 0;
		int a = Method();
		if (a == 2 || a == 3 || a == 12) {
			b = 1;
		}else if (a == 7 || a == 11) {
			b = 2;
		}else {
			point = a;
			while (b == 0) {
				a = Method();
				if (a == 7) {
					b = 1;
				}
				if (a == point) {
					b = 2;
				}
			}
		}
		if (b == 1) {
			System.out.println("You lose!");
		}else {
			System.out.println("You win!");
		}
	}
}
