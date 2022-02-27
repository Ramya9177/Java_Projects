
public class DataTypes {

	public static void main(String[] args) {
		int a=18;
		System.out.println(a);
		byte b=-127;//max range -128.......0......127
		System.out.println(b);
		short s=31000;//2 bytes  -32768......0.....32767
		System.out.println(Short.MIN_VALUE);
		int i=123456;//4 bytes -2147483648....0..2147483647
		System.out.println(Integer.MIN_VALUE);
		long l=65377874;//8 bytes   -9223372036854775808...0...-9223372036854775807
		System.out.println(Long.MIN_VALUE);
		
		char c='A';//2 bytes
		float f=4500.00f;//4 bytes  1.0E20
		double d=45000.00;//8 bytes
		// float and double stored as IEEE standards
		boolean bb=true;//1 byte
	}

}
