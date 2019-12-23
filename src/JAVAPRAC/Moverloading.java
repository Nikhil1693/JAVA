package JAVAPRAC;

public class Moverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=calculateScore(5,7);
		System.out.println("sum of you score is"+sum);
		calculateScore(9);

	}
	
	public static int calculateScore(int a,int b) {
		System.out.println("you score is"+a+"and "+b);
		int sum=a+b;
		return sum;
	}
	
	public static int calculateScore(int c) {
		System.out.println("your minimum score is"+c);
		return 0;
	
	}
	

}
