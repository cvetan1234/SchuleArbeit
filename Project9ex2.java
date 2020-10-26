//package smg;
//import java.util.Scanner;
//public class Project9ex2 {
//	static boolean is_it_a_palindrom(int num){
//		int memory = num;
//		int p,q;
//		int a = 0;
//		boolean pal = true;
//		while (num != 0) {
//			num = num/10;
//			a++;
//		}
//		num = memory;
//		if (a % 2 == 0) {
//			while (pal == true && num != 0) {
//				pal = false;
//				p = num/(10^(a));
//				q = num%(10^1);
//				if (p == q) {
//					pal = true;
//				}
//				num = (num - (p*10^(a-1)))/10;
//			}
//		}  
//		if (a % 2 != 0) {
//			while (pal == true && (num/10) != 0) {
//				pal = false;
//				p = num/(10^(a-1));
//				q = num%(10^1);
//				if (p == q) {
//					pal = true;ç
//				}
//				num = (num - (p*10^(a-1)))/10;
//			}
//		}
//		if (pal == true) { 
//			return true;
//		}else {
//			return false;
//		}
//	}
//	public static void main(String[] args) {
//		int num = 101;
//		System.out.println(is_it_a_palindrom(num));
//	}
//}
////	public static void main(String[] args) {
////		Boolean prime = true;
////		int num = 2;
////		int memory;
////		int a = 0,y = 0;
////		int p = 0,q = 1000;
////		boolean pal = true;
////		int delimo;
////		memory = num;
////		while (y < 120) {
////			a = 0;
////			memory = num;
////			while (num != 0) {
////				num = num/10;
////				a++;
////			}
////			num = memory;
////			if (a % 2 == 0) {
////				while (pal == true && num != 0) {
////					pal = false;
////					p = num/(10^(a-1));
////					q = num%(10^1);
////					if (p == q) {
////						pal = true;
////					}
////					num = (num - (p*10^(a-1)))/10;
////				}
////			}
////			if (a % 2 != 0) {
////				while (pal == true && (num/10) != 0) {
////					pal = false;
////					p = num/(10^(a-1));
////					q = num%(10^1);
////					if (p == q) {
////						pal = true;
////					}
////					num = (num - (p*10^(a-1)))/10;
////				}
////			}
////			num = memory;
////			delimo = num - 1;
////			while (delimo > 1) {
////				if (num % delimo == 0) {
////					prime = false;
////				}
////				memory--;
////			}
////			if (prime == true && pal == true) {
////				System.out.println(num + " ");
////				y++;
////			}
////			num++;
////		}
////		
////	}
////
////}
