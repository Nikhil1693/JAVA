package pattern;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r=5;
		for(int i=1;i<=r;i++) {
			int num=i;
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num=num+r-j;
			}
			System.out.println();
		}
	}

}
