package Arrays;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner=new Scanner(System.in);
	
	public static int[] getIntegers() {
		int number;
		System.out.println("Enter the number of integers.\r");
		number=scanner.nextInt();
		int arr[]=new int[number];
		System.out.println("Enter "+number+" array elements.\r");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		
		return arr;
		
	}
	
	public static void printArray(int[]array,int[] sorted) {
		int a[]=array;
		System.out.println("Array before sorting ");
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Element in "+i+" ,value is "+a[i]);
		}
		int b[]=sorted;
		System.out.println("Array after sorting");
        for(int i=0;i<b.length;i++) {
			
			System.out.println("Element in "+i+" ,value is "+b[i]);
		}
		
			
		}
	public static int[] sortIntegers(int[] array) {
		
		int[] sortedArray=new int[array.length];
		for(int i=0;i<array.length;i++) {
			sortedArray[i]=array[i];
		}
		boolean flag=true;
		int temp;
		while(flag) {
			flag=false;
			for(int i=0;i<sortedArray.length-1;i++) {
				if(sortedArray[i]<sortedArray[i+1]) {
					temp=sortedArray[i];
					sortedArray[i]=sortedArray[i+1];
					sortedArray[i+1]=temp;
					flag =true;
				}
			}
		}
		return sortedArray;
	}
		

	public static void main(String[] args) {
		
		int array[]=getIntegers();
		int sorted[]=sortIntegers(array);
		printArray(array,sorted);
		
	
		}

	}


