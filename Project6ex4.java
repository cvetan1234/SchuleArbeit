package smg;

import java.util.Scanner;
import java.lang.*;

public class Project6ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("����� �� � ������ ������? ");
	    double height = sc.nextDouble();
		System.out.println("����� �� � ������ ������? ");
		double width = sc.nextDouble();
		System.out.println("����� �� � ����� ������? ");
		double lenght = sc.nextDouble();
		double S = lenght*width + 2*(lenght*height) + 2*(width*height);
		S = Math.ceil(S);
		int S1 = (int)S;
		System.out.println(S1);
		int Q = S1/140;
		System.out.println("� �� ����� " + (((S1%140)/30 + 1)*4 + Q*15) + " ���.");
		
		
		
	}

}
