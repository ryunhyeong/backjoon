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
        int size = 100000;
        int num[] = new int[size];
        int count = 0;
        int first = 3;
        for(int j = 1; j<=5000;j++) {
        	count++;
        	for(int i = 0; i<=j; i++) {
        		if(num[N]==0) {
                    num[first*count + i*2] = count;
        		}
        		if(first*count + i*2 == N) {
        			break;
        		}
            	if(first*count + i*2 > size && num[N]==0) {
            		break;
            	}
            }
        }
        
        if(num[N]>0) {
        	System.out.println(num[N]);
        }
        else if(num[N]==0) {
        	System.out.println("-1");
        }
    }
}