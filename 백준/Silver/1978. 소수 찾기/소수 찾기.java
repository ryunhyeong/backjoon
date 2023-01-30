import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.security.DrbgParameters;
import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = 0;
        while(N-- > 0) {
        	boolean crime = false;
        	int a = Integer.parseInt(st.nextToken());
        	if(a<2) {
        		continue;
        	}
        	if(a==2) {
        		count++;
        		continue;
        	}
        	for(int i =2; i < a; i++) {
        		if(a % i ==0) {
        			crime = true;
        			break;
        		}
        	}
        	if(crime) {
        		continue;
        	}
        	else {
				count++;
			}
        	
        }
        System.out.println(count);
    }
}
    