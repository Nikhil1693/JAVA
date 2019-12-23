package StringsPRAC;

import java.util.Stack;

public class LongestNonRepeatedSubstring {

	
	public static String substring(String str) {
    Stack<Character> stack = new Stack<>();
    int last = 1;
    int prev = 0;
    String ans = "";
    int i;
    int max = -1;
    stack.push(str.charAt(0));
    for(i=1; i<str.length(); i++){
        if(stack.search(str.charAt(i)) != -1){
            if((i-prev) > max){
                ans = str.substring(prev, i);
                max = i-prev;
            }
            prev  = i;
            stack.clear();
            stack.push(str.charAt(i));
        }
        else{
            stack.push(str.charAt(i));
        }
    }
    if((i-prev) > max){
        ans = str.substring(prev, i);
    }
    return ans;
}
		
	public static void main(String[] args) {
		
		String str="ABBCDFGHC";
		
		String ans=substring(str);

		System.out.println("Longest non repeated substring is" +ans);
	}

}
