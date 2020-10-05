package edu.smg;
import java.util.Scanner;
public class Project8ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0;i < 10;i++){
			System.out.println("Въведи число, бите: ");
			arr[i] = sc.nextInt();
			}
		for (int a = 0;a <10;a++){
			double q = Math.random();
			q = q*10;
			int u = (int)q;
			int z = 0;
			z = arr[a];
			arr[a] = arr[u];
			arr[u] = z;
		}
		for (int d = 0;d < 10;d++){
			System.out.println(arr[d]);
		}
	}
}
