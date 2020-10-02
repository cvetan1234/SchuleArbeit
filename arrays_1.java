package edu.smg;

import java.util.Scanner;

	public class arrays_1 {
		public static void main(String[] args){
	//	int[] arr = new int[20];
	//	int[] arr1 = {4,36,78,89,90,101010,2323,232,3232,3232,34,4343,343443,3434};
		Scanner sc = new Scanner(System.in); 
		float[][] price = new float[10][3];
		float[][] price2 = {{1,2,3},{1,4,5},{2,9,2},{10,11,9}};
		long[][] matrix = new long[10][10];
		for (int i = 1; i<10; i++){
			for (int j = 0; j < 10; j++){
				matrix[i][j] = 5;
				//System.out.print(matrix[i][j] + " ");
			}
			//System.out.print("\n");
		}
		int[] grades = new int [5];
		for (int i = 0;i<5;i++){
			System.out.print("Въведете число, бите: ");
		    grades[i] = sc.nextInt();
		}
		
		for (int i = 0;i<5;i++){
			System.out.print(grades[i]);
		}
	}
}

