package smg;

public class Project15ex1 {

	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time(5555500);
		Time time3 = new Time (5, 23, 55);
		System.out.println(time1.getSecond());
		System.out.println(time2.getSecond());
		System.out.println(time3.getSecond());
	}

}
