package Abstraction;

public class Test {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		b.fuel();
	    b.start();
	    b.stop();
	    
	    Car c=new BMW();
	    ((BMW) c).fuel();
	    

	}

}
