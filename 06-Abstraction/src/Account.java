
public class Account {
	double balance;
	int typeofAccount; //1 or 2
	
	double getIntrestAmount() {
		//if type=1 35% of balance
		//if type=2 20% of balance
		
		/*if(typeofAccount==1)
			return balance*0.35;
		else if(typeofAccount==1)
			return balance*0.20;
		return 0;*/
		double bal = 0;
		switch(typeofAccount) {
		case 1 : 
			bal = balance*0.35; break;
			
		case 2 :
			bal= balance*20; break;
		default :
			System.out.println("Invalid...!!!");
		}
		return bal;
		
	}
}
