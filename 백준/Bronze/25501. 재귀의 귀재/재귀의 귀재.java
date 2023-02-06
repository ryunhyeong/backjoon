import java.util.*;
import java.io.*;

public class Main{
	static int count;
	public static int recursion(String s, int l, int r){
        if(l >= r) {
        	count++;
        	return 1;
        }
        else if(s.charAt(l) != s.charAt(r)) {
        	count++;
        	return 0;
    	}
        else {
        	count++;
        	return recursion(s, l+1, r-1);
        }
    }
    public static int isPalindrome(String s){
    	count=0;
        return recursion(s, 0, s.length()-1);
    }
    
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        while(N--> 0) {
        	String word = bf.readLine();
        	System.out.println(isPalindrome(word) +" " + count);
        	
        }
    }
}
        				