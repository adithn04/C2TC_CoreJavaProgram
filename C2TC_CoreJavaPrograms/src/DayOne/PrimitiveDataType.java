package DayOne;

public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte takes 1 byte
		byte maxByte = 127;
		byte minByte = -128;

		System.out.println("Min range of byte is " +
		        minByte + " Max range of byte is " + maxByte);

		// short - 2 bytes
		short maxShort = 32767;
		short minShort = -32768;

		System.out.println("Min range of short is " +
		        minShort + " Max range of short is " + maxShort);

		// int - 4 bytes
		int maxInt = 2147483647;
		int minInt = -2147483648;

		System.out.println("Min range of int is " +
		        minInt + " Max range of int is " + maxInt);

		// long - 8 bytes
		long maxLong= 9223372036854775807L;
		long minLong = -9223372036854775808L;

		System.out.println("Min range of long is " +
		        minLong + " Max range of long is " + maxLong);

		// float
		float floatVal = 3234.141243278345f;

		// double
		double doubleVal = 3456.14124512345678902345678914d;

		System.out.println("Float value is " + floatVal + " Double value is " + doubleVal);

		// boolean 
		boolean isFlagSet = false;
		System.out.println("Boolean value is " + isFlagSet);
	}

}
