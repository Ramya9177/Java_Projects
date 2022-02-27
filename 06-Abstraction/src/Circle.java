
public class Circle {

	private int radius;// instance variable
	
	int getRadius() { 
		return radius;
	}
	void setRadius(int r) {
		if(radius<0) {
			System.out.println("Invalid,,,!");
			return;
		}
		radius = r;
	}

	double getArea() {
		double area;
		double pi = 3.14;
		area = pi * radius * radius;
		return area;
	}
}
