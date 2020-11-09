package smg;
import java.util.Scanner; 

public class Project11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[5];
		String name;
		double grade;
		for (int i = 0;i < 5;i++) {
			System.out.println("Name?: ");
			name = sc.nextLine();
			System.out.println("Grade?: ");
			grade = sc.nextDouble();
			sc.nextLine();
			students[i] = new Student (name,grade);
		}
		sc.close();
	}
	static boolean does_He_Deserve_Money(Student student) {
		return student.grade > 5.50;
	}
	static void display_Students_That_Deserve_Money(Student students[]) {
		for (Student s : students) {
			if (does_He_Deserve_Money(s)) {
				System.out.println(s.name);
			}
		}
	}
}

