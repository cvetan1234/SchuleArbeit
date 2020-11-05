package smg;
import java.util.Scanner;

public class Project8arr4 {
	static int element_On_Position(int a, int position) {
		a = (int) (a / Math.pow(10, (position-1)));
		return a%10;
	}
	static boolean is_It_in_the_array_9(int c, int[] a) {
		boolean is_It_in_the_array = false;
		for (int r = 0;r<9;r++) {
			if (a[r] != c) {
				is_It_in_the_array = true;
			}
		}
		return is_It_in_the_array;
	}
	static boolean valid(int[] a) {
		boolean is_It_valid = true;
		if (a.length != 9) {
			return false;
		}
		for (int v = 0;v < 9;v++) {
			if (is_It_in_the_array_9(v,a) != true) {
				is_It_valid = false;
			}
		}
		return is_It_valid;
		
	}
	static void text(String a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		boolean is_It_Sudoku = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("SUDOKU: ");
		int[][] sudoku = new int[9][9];
		for (int i = 0; i < 9; i++) {
			input = sc.nextInt();
			for (int j = 0;j<9;j++) {
				sudoku[i][j] = element_On_Position(input,(9-j));
			}
		}
		//for (int i = 0;i < 9;i++) {
		//	for (int j = 0;j < 9;j++) {
		//		text("Type a number for row:" + (i+1) + " column:" + (j+1));
		//		sudoku[i][j] = sc.nextInt();
		//	}
		//}
		int[] a = new int[9];
		for (int j = 0;j<9;j++) {
			for(int q = 0;q<9;q++) {
				a[q] = sudoku[j][q];
				if (valid(a) != true) {
					is_It_Sudoku = false; break;
				}
			}
		}
		for (int j = 0;j<9;j++) {
			for(int q = 0;q<9;q++) {
				a[q] = sudoku[q][j];
				if (valid(a) != true) {
					is_It_Sudoku = false; break;
				}
			}
		}
		System.out.println(is_It_Sudoku);
	}
}

