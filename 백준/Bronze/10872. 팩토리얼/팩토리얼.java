import java.util.*;
import java.io.*;

public class Main{
	public static int factorial(int number) {
		if(number <= 1) {
			return 1;
		}
		else {
			return number * factorial(number-1);
		}
	}
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        System.out.println(factorial(N));
    }
}	
        				