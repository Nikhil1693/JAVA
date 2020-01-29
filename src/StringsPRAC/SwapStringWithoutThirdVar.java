package StringsPRAC;

public class SwapStringWithoutThirdVar {

	public static void main(String[] args) {
	
		//swap two string variables without using third variable.
		
		String a="Hello";
		String b="World";
		
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		
		 //1. appeand a and b
		
		a=a+b;//HelloWorld
		
		//2.store initial string a in string b
		
		b=a.substring(0, a.length()-b.length());//Hello
		
		//3. store initial string bin string a
		
		a=a.substring(b.length());
		
		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);

	}

}
