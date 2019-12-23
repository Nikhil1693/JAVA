package JAVAPRAC;

public class datatype {

	public static void main(String[] args) {
		
		byte myminbytevalue=Byte.MIN_VALUE;
		byte mymaxbytevalue=Byte.MAX_VALUE;
		
		System.out.println(myminbytevalue);
		System.out.println(mymaxbytevalue);
		
		short myminshortvalue=Short.MIN_VALUE;
		short mymaxshortvalue=Short.MAX_VALUE;
		
		System.out.println(myminshortvalue);
		System.out.println(mymaxshortvalue);

		
		long mylongvalue=100_1213_1313_1313_13L;
		long myminlongvalue=Long.MIN_VALUE;
		long mymaxlongvalue=Long.MAX_VALUE;
		
		System.out.println(myminlongvalue);
		System.out.println(mymaxlongvalue);
		System.out.println(mylongvalue);
		
		byte myvalue= (byte) (myminbytevalue / 2);
		System.out.println(myvalue);
		
		short myvalue2=(short)(myminshortvalue/2);
		System.out.println(myvalue2);
		
		byte num=24;
		short num1 = 100;
		int num2 = 50000;
		long num3=50000L+10L*(num+num1+num2);
		System.out.println(num3);
		
		
	}

}
