package smg_3;

import java.util.Scanner;

public class Project4ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many numbers?");
		Scanner reader = new Scanner(System.in);
		double numbers[] = new double[20];
		int broj = reader.nextInt();
		System.out.println("Enter them");
		for(int i=0; i<broj; i++) {
			numbers[i] = reader.nextDouble();
		}
		System.out.println(" The average is " + average(numbers, broj));
	}
	
	public static double average(double[] arr, int br) {
		return sum(arr, br, 0)/br;
	}
	
	public static double sum(double[] arr, int br, double res) {
		if(br==0) return res;
		return sum(arr, br-1, res + arr[br-1]);
	}

	
}
