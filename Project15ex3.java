package smg;

public class Project15ex3 {

	public static void main(String[] args) {
		Inteeger i = new Inteeger(5);
		System.out.println(i.isOdd());
		System.out.println(i.isEven());
		System.out.println(i.isPrime());
		System.out.println(Inteeger.isOdd(5));
		System.out.println(Inteeger.isEven(5));
		System.out.println(Inteeger.isPrime(5));
		System.out.println(Inteeger.isOdd(i));
		System.out.println(Inteeger.isEven(i));
		System.out.println(Inteeger.isPrime(i));
		int q = Inteeger.parseInt("1234");
		q++;
		System.out.println(q);
		char[] u = {1,2,3,4};
		System.out.println(Inteeger.parseInt(String.valueOf(u)));
	}

}
