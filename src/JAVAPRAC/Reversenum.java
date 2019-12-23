package JAVAPRAC;

public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=12398;
		int remainder=0;
		int rev=0;
		
		do {
			
			remainder=number%10;
			rev=rev*10+remainder;
			number=number/10;
			
			
			
		}while(number>0);
		
		System.out.println(rev);
	}
	

}
