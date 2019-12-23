package pattern;

public class Pattern1 {

	public static void main(String[] args) {
		
		
		int i=0;
		int j=1;
		int r=7;
		
		for(i=1;i<=r;i++) {
			for(j=1;j<=i;j++) {
				
				System.out.print(j+ " ");
				
			}
				System.out.println();
			
		}
		for(i=r-1;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}

	}

}
