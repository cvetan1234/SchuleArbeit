package smg;

public class TestTest {

	public static void main(String[] args) {
		Student s = new Student("Tosho",5.0);
		System.out.println(s.grade);
		s.setGrade(6.00);
		s.setName("Tosho_2.0");
		System.out.println(s.grade + s.name);
		System.out.println(s.getName());
		System.out.println(s.getGrade());
	}

}
