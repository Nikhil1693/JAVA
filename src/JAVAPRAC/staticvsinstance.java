package JAVAPRAC;

public class staticvsinstance {

	
	private static int num;
	
	public staticvsinstance(int num) {
		staticvsinstance.num=num;
	}
	
	public void show() {
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticvsinstance si=new staticvsinstance(123);
		si.show();
		
		}

	}


