
public class RectangleClient {
   public static void main(String[] args) {
	Rectangle r1 = new Rectangle();
	r1.setHeight(5);
	r1.setWidth(6);
	System.out.println("area r1 : "+r1.getArea());
	Rectangle r2 = new Rectangle(4,5);
	System.out.println("area r2 : "+r2.getArea());
}
}
