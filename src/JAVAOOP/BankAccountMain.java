package JAVAOOP;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAcount ba=new BankAcount();
		
		ba.setdata(123456, 0.00,"Nikhil Aggarwal", "niks6993@gmail.com", 989926674);
		ba.getdata();
		//ba.deposit_fund(0.00);
		ba.withdraw_fund(10000.00);
		

	}

}
