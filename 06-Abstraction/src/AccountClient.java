
public class AccountClient {

	public static void main(String[] args) {
		Account account = new Account();
		account.balance=15000.00;
		account.typeofAccount=1;
		
		System.out.println(account.getIntrestAmount());

	}

}
