package StringsPRAC;

import java.util.Scanner;

public class MAXOccuring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a string");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		char[] c=str.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
		s.close();
	}

}
