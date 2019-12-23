package JAVAOOP;

public class BankAcount {
	
	private int account_number;
	private double balance;
	private String customer_name;
	private String email;
	private int phone_number;
	
	
	public void setdata(int account_number,double balance,String customer_name,String email,int phone_number) {
		 
		this.account_number=account_number;
		this.balance=balance;
		this.customer_name=customer_name;
		this.email=email;
		this.phone_number=phone_number;
	}

	public void getdata() {
		System.out.println("Account number is: "+ this.account_number);
		System.out.println("Account Balance is: "+ this.balance);
		System.out.println("Customer name is: "+this.customer_name);
		System.out.println("Email is: "+this.email);
		System.out.println("Phone number is: "+this.phone_number);
	}
	
	public void deposit_fund(double deposit) {
		System.out.println("Your current balance is:" +this.balance);
		System.out.println("The amount entered by u to add is:" +deposit);
		this.balance+=deposit;
		double balanceAfterDeposit=this.balance;
		System.out.println("Account Balance after Deposit is: "+balanceAfterDeposit);
	}
	
	public void withdraw_fund(double withdraw) {
		System.out.println("Your current balance is:" +this.balance);
		if(this.balance<=0) {
			System.out.println("Insufficient Funds!!");
		}
		else {
		System.out.println("The amount entered by u to withdraw is:" +withdraw);
		this.balance-=withdraw;
		double balanceAfterwithdrawal=this.balance;
		System.out.println("Account Balance after withdrawal is: "+balanceAfterwithdrawal);
		}
		
	
	}
}
