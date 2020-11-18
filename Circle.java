package smg;

class Circle {
	public double radius;
		
	public Circle(double newRadius) {
		radius = newRadius;
	}
		
	double getArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	double getPerimeter() {
		double perimeter = 2*Math.PI*radius;
		return perimeter;
	}
	void setRadius(double newRadius) {
		radius = newRadius;
	}
	double getRadius(double a) {
		return a = radius;
	}
}

