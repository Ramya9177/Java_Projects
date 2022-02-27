import java.util.Scanner;
public class FactorialClient {

	public static void main(String[] args) {
		
		Factorial factorial = new Factorial();
		factorial.number=5;
		System.out.println(factorial.getFactorial());
		
		Factorial factorial1=new Factorial();
		factorial1.number=new Scanner(System.in).nextInt();
		System.out.println(factorial1.getFactorial());
		
	}
}
