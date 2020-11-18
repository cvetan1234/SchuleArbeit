package smg;

public class Project15ex4 {

	public static void main(String[] args) {
		MyPoint point = new MyPoint();
		MyPoint point1 = new MyPoint(2,2);
		System.out.println(point.distance(point1));
		System.out.println(MyPoint.distance(point1, point));
		System.out.println(point.distance(2,2));
	}

}
