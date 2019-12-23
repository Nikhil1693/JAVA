package JAVAPRAC;

public class parsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String numberAsstring="2018";
		String numberAsString="2018.125";
		System.out.println(numberAsstring);
		
		int num=Integer.parseInt(numberAsstring);
		double num1=Double.parseDouble(numberAsString);
		System.out.println(num);
		System.out.println(num1);
		
		numberAsstring+=1;
		numberAsString+=1;
		num+=1;
		num1+=1;
		
		System.out.println(numberAsstring);
		System.out.println(num);
		
		System.out.println(numberAsString);
		System.out.println(num1);
	}

}
