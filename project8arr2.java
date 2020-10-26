package smg;
import java.util.Scanner;
public class project8arr2 {
	public static void main(String[] args) {
		System.out.print("");
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете размер на масива: ");
		int arr_size = sc.nextInt();
		int[][] arr = new int[arr_size][arr_size];
		int[][] arr_new = new int[arr_size][arr_size];
		for (int i = 0;i < arr_size;i++) {
			for (int n = 0;n < arr_size;n++) {
				System.out.print("Въведете елемент " + i + n + " :");
				arr[i][n] = sc.nextInt();
			}
		}
		for (int q = 0;q < arr_size;q++) {
			for (int t = 0;t < arr_size;t++) {
				System.out.print(arr[q][t] + " ");
			}
			System.out.println(" ");
		}
		for (int q = 0;q < arr_size;q++) {
			for (int t = 0;t < arr_size;t++) {
				arr_new[q][t] = arr[t][q];
			}
		}
		System.out.println(); 
		for (int q = 0;q < arr_size;q++) {
			for (int t = 0;t < arr_size;t++) {
				System.out.print(arr_new[q][t] + " ");
			}
			System.out.println(" ");
		}
	}
}