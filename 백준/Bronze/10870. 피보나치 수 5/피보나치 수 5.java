import java.util.*;
import java.io.*;

public class Main{
	public static int fibo(int number) {
		if(number == 0) {
			return 0;
		}
		else if(number == 1) {
			return 1;
		}
		else {
			return fibo(number-1) + fibo(number-2);
		}
	}
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        System.out.println(fibo(N));
    }
}	
        				