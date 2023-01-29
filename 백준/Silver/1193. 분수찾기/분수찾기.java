import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.security.DrbgParameters;
import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int num = 1;
        int plus_num = 1;
        
        while(true) {
        	if(N==1) {
        		System.out.println(N+"/"+N);
        		break;
        	}
        	else {
        		if(N<=num) {
        			int a = N - (num - plus_num);
    				int b = plus_num+1 - a;
        			if(plus_num%2==0) {
        				System.out.println(a+"/"+b);
        				break;
        			}
        			else {
        				System.out.println(b+"/"+a);
        				break;
        			}
        		}
        		else {
        			plus_num++;
        			num= num+plus_num;
        		}
        	}
        }
    }
}