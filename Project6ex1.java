package smg;
import java.util.Scanner; 

public class Project6ex1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете дължина на вълната(nm-нанометри): ");
		int waveLenght = Integer.parseInt(sc.nextLine());
		if (waveLenght >= 380 && waveLenght < 450) {
			System.out.println("Лилаво");
		}else if (waveLenght >= 450 && waveLenght < 495) {
			System.out.println("Синьо");
		}else if (waveLenght >= 495 && waveLenght < 570) {
			System.out.println("Зелено");
		}else if (waveLenght >= 570 && waveLenght < 590) {
			System.out.println("Жълто");
		}else if (waveLenght >= 590 && waveLenght < 620) {
			System.out.println("Оранжево");
		}else if (waveLenght >= 620 && waveLenght < 750) {
			System.out.println("Червено");
		}else if (waveLenght < 380) {
			System.out.println("Ултравиолетов (извън спектъра)");
		}else {
			System.out.println("Инфрачервен (извън спектъра)");
		}
		
	}

}
