
public class Employee {
	double basicSalary;
	
	double getAllowance() {
		return basicSalary*45.0/100.0;
	}
	
	double getNetSalary() {
		return basicSalary+ (basicSalary*45.0/100.0);
	}
}
