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
//        StringTokenizer st = new StringTokenizer(bf.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
        int a = 2;
        if(N==1) {
        	return;
        }
        if(N==2) {
        	System.out.println(N);
        	return;
        }
        while(a<=N || N!=1) {
        	if(N % a == 0) {
        		System.out.println(a);
        		N/=a;
        	}
        	else {
				a++;
			}
        }
    }
}
    