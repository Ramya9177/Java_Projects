
public class CustomerClient {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setBalance(50000000);
		System.out.println(customer.getBalance());
		boolean result=customer.isGoodCustomer();
		if(result)
			System.out.println("good customer");
		else
			System.out.println("bad customer");
	}

}
