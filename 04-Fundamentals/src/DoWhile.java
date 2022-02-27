
/*public class DoWhile {

	public static void main(String[] args) {
		int i=1;
		do {
			System.out.println(i);
			i++;
		} while(i<=10);
		System.out.println("done");
	}

}*/
//post testing loop
//it execute at least once irrespective of condition
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		
		int choice=0;
		do {
	
		System.out.println("1. add");
		System.out.println("2. substract");
		System.out.println("3. muliply");
		System.out.println("4. Divide");
		System.out.println("5. exit");
		Scanner sc = new Scanner(System.in);
		choice =sc.nextInt();
	} while(choice !=5);
	}
}