
public class Employee1 {
	double basicSalary;
	char grade;

	double getAllowance() {
		double allowance=0;

		switch (grade) {
		case 'A':
			allowance = basicSalary * 0.35;
			break;
		case 'B':
			allowance = basicSalary * 0.28;
			break;
		case 'C':
			allowance = basicSalary * 0.10;
			break;
		default:
			System.out.println("Invalid grade...!");
			break;
		}
		return allowance;
	}

	double getNetSalary() {
		return basicSalary + getAllowance();
	}
}
