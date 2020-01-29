package StringsPRAC;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str1="The rains have Started";
		String str2="The rains have started";
		
		System.out.println("length of String "+str1.length());
		
		System.out.println("Index of 'r' "+str1.indexOf('r'));
		
		System.out.println("Index of 'r' "+str1.indexOf('r',str1.indexOf('r')+1));//2nd occurence of r
		
		System.out.println(str1.charAt(6));
		
		System.out.println(str1.indexOf("have"));
		
		System.out.println(str1.indexOf("hello"));
		
		//String Comparison
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//String substring
		
		System.out.println(str1.substring(0, 9));
		
		//trim
		String str="   Hello World    ";
		System.out.println(str.trim());
		
		//replace
		String str3="01-02-2020";
		System.out.println(str3.replace('-', '/'));
		
		//split
		String test="Hello_World_Test_Selenium";
		String str4[]=test.split("_");
		System.out.println(Arrays.toString(str4));
		
		String s="nikhil";
		System.out.println(s.concat("a"));
		
		String x="hello";
		String y="world";
		int a=100;
		int b=200;
		
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
		

	}

}
