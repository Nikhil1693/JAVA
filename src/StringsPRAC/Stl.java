package StringsPRAC;

public class Stl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="nikhil";
		String S = str.concat("#");
		int i;
		char c[]=S.toCharArray();
		int k =0;
		
		for (i=0;c[i]!='#';i++) {k=k+1;}
		
		/*
		 * for(char c:str.toCharArray()) {
		 * 
		 * i++; }
		 */
System.out.println(k);
	}

}