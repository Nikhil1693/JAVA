package pattern;

public class pattern3 {

	public static void main(String[] args) {
		
	int r=7;

int i;
	
	for(i=1;i<=r;i++) {
		for(int j=1;j<i;j++) {
			System.out.print(" ");
		}
		
		for(int j=i;j<=r;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	
		for(i=r-1;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" "); 
				} 
			for(int j=i;j<=r;j++) {
				System.out.print(j);
		 
		  } System.out.println(); }
		
	

	}

}
