package edu.smg;
import java.util.Scanner;
public class Project8ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0;i < 10;i++){
			System.out.println("Въведи число, бите: ");
			arr[i] = sc.nextInt();
			}
		int[] arr1 = new int[10];
		for (int a = 0;a < 9;a++){
			arr1[a] = arr[a+1];
		}
		arr1[9] = arr[0];
		for (int d = 0;d < 10;d++){
			System.out.println(arr1[d]);
		}	
		}
}
