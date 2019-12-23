package pattern;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r=7;
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<i;j++){
				
				System.out.print(" ");
			}
			for(int j=i;j<=r;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=r-1;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=r;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
