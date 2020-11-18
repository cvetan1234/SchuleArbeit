package smg;

public class Inteeger {
	private int value;
	Inteeger(int newValue){
		value = newValue;
	}
	boolean isEven() {
		if (value % 2 == 0) {
			return true;
		}else{
			return false;
		}
	}
	boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		}else{
			return false;
		}
	}
	boolean isPrime() {
		boolean b = true;
		int a = value - 1;
		for (;a>1;a--) {
			if (value%a==0) {
				b = false;
			}
		}
		return b;
	}
	static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}else{
			return false;
		}
	}
	static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		}else{
			return false;
		}
	}
	static boolean isPrime(int value) {
		boolean b = true;
		int a = value - 1;
		for (;a>1;a--) {
			if (value%a==0) {
				b = false;
			}
		}
		return b;
	}
	static boolean isEven(Inteeger i) {
		int intValue = i.value;
		if (intValue % 2 == 0) {
			return true;
		}else{
			return false;
		}
	}
	static boolean isOdd(Inteeger i) {
		int intValue = i.value;
		if (intValue % 2 != 0) {
			return true;
		}else{
			return false;
		}
	}
	static boolean isPrime(Inteeger i) {
		int intValue = i.value;
		boolean b = true;
		int a = intValue - 1;
		for (;a>1;a--) {
			if (intValue%a==0) {
				b = false;
			}
		}
		return b;
	}
	static int parseInt(char[] a) {
		return Integer.parseInt(new String());
	}
	static int parseInt(String s) {
		int i;
		i = Integer.parseInt(s);
		return i;
	}
}
