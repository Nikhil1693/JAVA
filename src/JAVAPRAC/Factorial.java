package JAVAPRAC;

import java.util.Scanner;

public class Factorial {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {


		int value,f=1;
        System.out.println("Enter the number:");
        value=scanner.nextInt();
        f=value;
        for(int i=(value-1);i>1;i--) {
        	f=f*i; 
        }
        System.out.println("Factorial is:"+f);
	}

}
