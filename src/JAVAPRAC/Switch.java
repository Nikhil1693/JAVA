package JAVAPRAC;

public class Switch {
	
	public static void main(String[] args) {
		
		int value=3;
		
		switch(value) {
		case 1:
			System.out.println("value is 1");
			break;
			
		case 2:
			System.out.println("value is 2");
			break;
			
		case 3:case 4:case 5:
			System.out.println("Actually it was for case" +value);
			break;
			
		default:
			System.out.println("was not 1 and 2");
			break;
		}
		
	}

}
