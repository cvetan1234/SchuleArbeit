package smg;
public class Project9ex3 {
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
 	static boolean emirp_2(int a){
 		if (a/100 >= 1) {
 			return false;
 		}else {
 			int edinici = a%10;
 			int desetici = a/10;
 			int reverse = edinici*10 + desetici;
 			if ((prime(a) == true && prime(reverse) == true) && (a != reverse)) {
 				return true;
 			}else {
 				return false;
 			}
 		}
 	}
	static boolean emirp_3(int a) {
		if (a/1000 >= 1) {
			return false;
		}else {
			int edinici = a%10;
			int desetici = (a/10)%10;
			int stotici = a/100;
			int reverse = edinici*100 + desetici*10 + stotici;
			if ((prime(a) == true && prime(reverse) == true) && (a != reverse)) {
				return true;
			}else {
				return false;
			}
		}
	}
	static boolean emirp_4(int a) {
		int edinici = a%10;
		int desetici = (a/10)%10;
		int hilqdi = a/1000;
		int stotici = (a - hilqdi*1000)/100;
		int reverse = edinici*1000 + desetici*100 + stotici*10 + hilqdi;
		if ((prime(a) == true && prime(reverse) == true) && (a != reverse)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		int a = 1; 
		int broqch = 0;
		while (broqch < 120) {
			if (emirp_2(a) == true || emirp_3(a) == true || emirp_4(a) == true) {
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
