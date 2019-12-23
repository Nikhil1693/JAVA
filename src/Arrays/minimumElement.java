package Arrays;


import java.util.Scanner;

public class minimumElement {
	
	
private static Scanner scanner=new Scanner(System.in);

public static int[] getIntegers(int number) {
  
  int[] a=new int[number];
  for(int i=0;i<a.length;i++) {
	  a[i]=scanner.nextInt();
  }
  return a;
}

public static int minimum(int[] arr){
	int min=Integer.MAX_VALUE;
	int[] array=arr;
	
		for(int i=0;i<array.length-1;i++) {
			int value=array[i];
		    if(value<min) {
		    	min=value;
			
			}
		}
		return(min);
	
}
	public static void main(String[] args) {
	System.out.println("Enter the number of Integers:");
    int number=scanner.nextInt();
	int	[]arr=getIntegers(number);
	int mini=minimum(arr);
	System.out.println("minimum element is:"+mini);
	

	}

}
