
public class CircleClient {
	public static void main(String[] args) {

		Circle c1;// circle is a datatype
		c1 = new Circle();

		c1.setRadius(12);

		double area = c1.getArea();
		System.out.println(c1.getRadius());
		System.out.println(area);

		Circle c2;
		c2 = new Circle();
		c2.setRadius(7);
		System.out.println(c2.getRadius());
		System.out.println(c2.getArea());

		Circle c3;
		c3 = new Circle();
		c3.setRadius(15);
		System.out.println(c3.getRadius());
		System.out.println(c3.getArea());

	}
}
