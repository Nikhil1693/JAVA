package JAVAPRAC;

import java.util.Scanner;

public class ReadingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your name");
		String name=scanner.nextLine();
		System.out.println("enter your age");
		int age=scanner.nextInt();
		scanner.close();
		System.out.println("name is: "+name);
		System.out.println("age is: "+age);
		

	}

}
