package smg;

public class MyPoint {
	private double x;
	private double y;
	MyPoint(){
		x = 0;
		y = 0;
	}
	MyPoint(double setX, double setY){
		x = setX;
		y = setY;
	}
	double module (double m) {
		if (m < 0) {
			m = m*-1;
		}
		return m;
	}
	double distance (MyPoint m) {
		double mx = m.x;
		double my = m.y;
		return Math.sqrt(module(mx-x)*module(mx-x) + module(my-y)*module(my-y));
	}
	double distance (double x2, double y2) {
		return Math.sqrt(module(x2-x)*module(x2-x) + module(y2-y)*module(y2-y));
	}
	static double distance (MyPoint m, MyPoint n) {
		double mx = m.x;
		double my = m.y;
		double nx = n.x;
		double ny = n.y;
		double a = mx-nx;
		double b = my-ny;
		if (a < 0) {
			a = a*-1;
		}
		if (b < 0) {
			b = b*-1;
		}
		return Math.sqrt((a*a) + (b*b));
	}
}
