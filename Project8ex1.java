package edu.smg;

import java.util.Scanner;

public class Project8ex1 {

	public static void main(String[] args) {
		double[] arr = new double[20];
		for (int i = 0;i<20;i++){
			arr[i] = Math.random()*100;
		}
		for (int a = 0;a<20;a++){
			System.out.println(arr[a]);
		}

	}

}
