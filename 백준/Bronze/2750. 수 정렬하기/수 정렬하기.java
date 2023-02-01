import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.security.DrbgParameters;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

import javax.naming.spi.DirStateFactory.Result;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
    	int result[] = new int[N];
    	int max = 0;
    	for(int i = 0; i <N;i++) {
    		result[i] = Integer.parseInt(bf.readLine());
    	}
    	for(int i =0; i<N-1; i++) {
    		for(int j = i+1; j<N; j++) {
    			if(result[i]>result[j]) {
    				int temp = result[i];
    				result[i]= result[j];
    				result[j] = temp;
    			}
    		}
    	}
    	for(int i:result) {
    		System.out.println(i);
    	}
    }
}
    