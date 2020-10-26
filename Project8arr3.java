package smg;
import java.util.Scanner;
import java.util.Random;
public class Project8arr3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int[] arr = new int[10];
		for (int i = 0;i<10;i++) {
			arr[i] = rand.nextInt(4);
		}
		int[][] students = new int[8][10];
		int[] points = new int[8];
		for (int i = 0;i<8;i++) {
			points[i] = 0;
		}
		System.out.println("Верните отговори са: ");
		for (int i = 0;i<10;i++) {
			System.out.print("Въпрос" + (i+1) + ":");
			switch(arr[i]) {
			case 0: System.out.print("A "); break;
			case 1: System.out.print("B "); break;
			case 2: System.out.print("C "); break;
			case 3: System.out.print("D "); break;
			}
		}
		for (int i = 0;i<8;i++) {
			for (int q = 0;q<8;q++) {
				students[i][q] = rand.nextInt(4);
				if (students[i][q] == arr[i]) {
					points[i]++;
				}
			}
		    System.out.println("Ученик " + (i+1) + " " + "има " + points[i] + " точки");
		}
	}
}

