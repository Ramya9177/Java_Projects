
public class Factorial {
	int number;

	int getFactorial() {
		int fact=1;
		while(number>0) {
			fact*=number;
			number--;
		}
		return fact;
	}
}
