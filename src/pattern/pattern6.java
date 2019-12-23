package pattern;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r=7;
		
		for(int i =1;i<=r;i++) {
			for(int j=1;j<=r-i;j++) {
				System.out.print(1);
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}


}