package smg;

public class BMI {
	private String name;
	private int age;
	private double weigth;
	private double heigth;
	BMI (String newName, int newAge, double newWeight, double newHeight){
		name = newName;
		age = newAge;
		weigth = newWeight;
		heigth = newHeight;
	}
	BMI (String name, double weight, double height){
		this(name, 20, weight, height);
	}
	BMI (String newName, int newAge, double newWeigth, double feet, double inches){
		name = newName;
		age = newAge;
		weigth = newWeigth;
		heigth = (feet*30.48 + inches*2.54)/100;
	}
	double getBMI() {
		return ((weigth/heigth)/heigth);
	}
	
}
