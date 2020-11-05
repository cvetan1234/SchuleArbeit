package smg;

public class Project9ex2 {
	static boolean prime(int a) {
		int b = a - 1;
		boolean c = true;
		while (b > 1) {
			if (a%b == 0) {
				c = false;
			}
			b--;
		}
		return c;
	}
	static int reverse(int a) {
		int copyNumber = a;
		int reversedNum = 0;
		while (copyNumber != 0) {
			int reminder = copyNumber % 10;
			reversedNum = reversedNum * 10 + reminder;
			copyNumber /= 10;
		}
		return reversedNum;
	}
	static boolean pal(int a) {
		if (a == reverse(a)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		int a = 1; 
		int broqch = 0;
		while (broqch < 120) {
			if (prime(a) == true && pal(a) == true) {
				broqch++;
				if (broqch % 10 == 0) {
					System.out.println(a + " ");
				}else {
					System.out.print(a + " ");
				}
			}
			a++;
		}
	}
}
