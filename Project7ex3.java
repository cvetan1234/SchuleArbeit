package smg;
import java.util.Scanner;
public class Project7ex3 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Rows? ");
		int rows = sc.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int j = rows - i; j > 0; j--) {
				System.out.print(j + " ");
			}
			for (int j = 2; j <= rows - i; j++) {
				System.out.print(j + " ");
			} System.out.println();
		}
	}
}