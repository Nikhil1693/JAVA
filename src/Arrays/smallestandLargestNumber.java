package Arrays;

import java.util.Arrays;

public class smallestandLargestNumber {

	public static void main(String[] args) {
		
		int num[]= {-10,24,50,-88,987656};
		
		int largest=num[0];
		int smallest=num[0];
		
		for(int i=1;i<num.length;i++) {
			
			if(num[i]>largest) {
				largest=num[i];
			}
			else if(num[i]<smallest) {
				smallest=num[i];
			}
		}
		System.out.println("Array is: "+Arrays.toString(num));
		System.out.println("Largest number is: "+largest);
		System.out.println("Smallest number is: "+smallest);
		}

	}


