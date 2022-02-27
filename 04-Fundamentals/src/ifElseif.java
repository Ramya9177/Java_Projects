
public class ifElseif {

	public static void main(String[] args) {
		
		int mark =78;
		
		if(mark<=100 && mark>=90)
			System.out.println('A');
		else if(mark>=70 && mark<=89)
			System.out.println('B');
		else if(mark>50 && mark<=69)
			System.out.println('C');
			else if(mark>0 && mark<=50)
				System.out.println('D');
			else
				System.out.println("Invalid....!");
	}

}
