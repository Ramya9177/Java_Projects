
public class EmpClient {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.basicSalary = 10000.00;

		System.out.println(e1.getAllowance());
		System.out.println(e1.getNetSalary());

		Employee employee = new Employee();
		employee.basicSalary = 15000;

		System.out.println(employee.getAllowance());
		System.out.println(employee.getNetSalary());
		
		Employee e2 = new Employee();
		e2.basicSalary = 35000.00;

		System.out.println(e2.getAllowance());
		System.out.println(e2.getNetSalary());
		
		
		Employee1 employee1 = new Employee1();
		employee1.basicSalary=12000.00;
		employee1.grade='A';
		System.out.println(employee1.getAllowance());
		System.out.println(employee1.getNetSalary());
	}
}
