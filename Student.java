package smg;

class Student {
	public String name;
	public double grade;
	public Student(String newName, double newGrade) {
		name = newName;
		grade = newGrade;
	}
	void setName(String newName) {
		this.name = newName;
	}
	String getName() {
		return this.name;
	}
	void setGrade(double newGrade) {
		this.grade = newGrade;
	}
	double getGrade () {
		return this.grade;
	}
}
