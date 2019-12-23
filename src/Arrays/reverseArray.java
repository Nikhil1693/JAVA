package Arrays;

import java.util.Scanner;

public class reverseArray {
	private static Scanner scanner=new Scanner(System.in); 
	
	public static int[] getElements(int number) {
		int arr[]=new int[number];
		System.out.println("Enter "+number+" Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		return arr;
	}
	
	public static void revarr(int a[]) {
		
		
		int array[]=a;
		int k=0;
		System.out.println("Array before reverse:");
		for(int j=0;j<array.length;j++) {
			System.out.println(array[j]);
		}
		
		 int temp[]=new int[array.length]; 
		 
		 int i; 
		 for( i=array.length-1;i>=0;i--) {
		 temp[k]+=array[i];
		 k++;
		 
		} 
		 System.out.println("Array after reverse:");
		 
		 for(int j=0;j<temp.length;j++) {
				System.out.println(temp[j]);
			}
	}

	public static void main(String[] args) {
		int[] a=getElements(6);
		revarr(a);

	}

}
