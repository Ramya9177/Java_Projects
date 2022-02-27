
public class Main2 {

	public static void main(String[] args) {
		
		double[] prices= {10.0,5.0,7.0,8.0};
		
		//sum of all the elements
		double sum=0;
		
		for(double element:prices) {
			sum +=element;
		}
		System.out.println("sum : "+sum);
		
		//double avg=sum/prices.length;
		System.out.println("average : "+sum/prices.length);
		
		double max=prices[0],min=prices[0];
		
		for(double element1:prices) {
			if(element1>max)
				max=element1;
		}
		System.out.println("max value : "+max);
		
		for(double element2 :prices) {
			if(element2<min) 
				min=element2;
		}
		System.out.println("min value : "+min);
	}
}


