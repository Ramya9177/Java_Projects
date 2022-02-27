//long double float boolen is not allowed in switch case
public class Switch {

	public static void main(String[] args) {
		
		char grade='C';
		
		switch(grade) {
		case 'A' : System.out.println("congrats...! very good");
		             break;
		case 'B' : System.out.println("very good");
		                break;
		case 'C' : System.out.println("good");
		                  break;
		case 'D' : System.out.println("Work Hard");
		             break;
		  default : System.out.println("Invalid");
		}
		/*public static void main(String[] args) {
			byte b=50;
			
			switch(b) {
			case 20 : System.out.println("congrats...! very good");
            break;
case 40 : System.out.println("very good");
               break;
case 60 : System.out.println("good");
                 break;
default : System.out.println("Work Hard");
			}*/
		
		short b=40;
		final short v1=20;
		final short v2=40;
		final short v3=60;
		
		switch(b) {
		case v1 : System.out.println("a1");break;
		case v2 : System.out.println("a2");break;
		case v3 : System.out.println("a3");break;
		default : System.out.println("Invalid");
		}
		
		}
	}


