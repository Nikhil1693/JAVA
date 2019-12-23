package StringsPRAC;

public class firstNonRepeatCharacter {

	public static void main(String[] args) {


		String str="zanzibar";
		
		char ct= findNonRepeat(str);
		
		if(ct != 0) {
			System.out.println("Character is:" +ct);
		}else {
			System.out.println("No repeating character found");
		}

	}
	
	private static char findNonRepeat(String str) {
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(str.indexOf(c)==str.lastIndexOf(c)) {
				return c;
			}
			
		 }
		return 0;
	}
	
	

}
