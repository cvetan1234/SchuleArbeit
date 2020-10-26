package smg;

class Student{
	public void Student(){
	}
	public String name;
	public double ocenka;
	boolean zaStipendiaLiE() {
		if (ocenka >= 5.50) {
			return true;
		}
		return false;
	}
}
public class Project11 {
	public static void main(String[] args) {
		int 
		Student Petko = new Student();
		Petko.ocenka = 5.00;
		Petko.name = "Petko";
	}
}
