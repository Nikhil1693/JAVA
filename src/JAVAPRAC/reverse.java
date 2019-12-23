package JAVAPRAC;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="nikhil";
		String temp="";
		int i;
		for(i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		System.out.println(temp);
	} 

}
