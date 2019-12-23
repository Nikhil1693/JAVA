package pattern;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r=7;
		
		for(int i=1;i<=r;i++) {
			if(i%2==1) {
			for(int j=1;j<=r;j++) {
				
				if(j%2==0) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
			}
			}
			if(i%2==0) {		
				
	        for(int j=1;j<=r;j++) {
	        	if(j%2==0) {
	        		System.out.print(1);
	        	}
	        	else
	        		System.out.print(0);
	        }
			
			}
			System.out.println();

	}
	}
}
