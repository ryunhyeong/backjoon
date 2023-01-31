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
        int result = 0;
    	int paper[][] = new int[100][100];
        while(N--> 0) {
        	StringTokenizer st = new StringTokenizer(bf.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	for(int i=a; i<a+10; i++) {
        		for(int j=b; j<b+10; j++) {
        			paper[i][j]=1;
        		}
        	}
        }
        for(int i = 0; i<100; i++) {
        	for(int j = 0; j<100; j++) {
        		result += paper[i][j];
        	}
        }
        System.out.println(result);
    }
}
    