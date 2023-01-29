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
        int T = Integer.parseInt(bf.readLine());

        while(T-- >0) {

        	int k = Integer.parseInt(bf.readLine());
        	int n = Integer.parseInt(bf.readLine());

        	int intArray[][] = new int[k+1][14+1];
        	
        	for(int k1 = 1; k1<=k; k1++) {
        		intArray[k1][1] = 1;
        	}
        	for(int k2 = 1; k2<=n; k2++) {
        		intArray[0][k2] = k2;
        	}
        	for(int i =1; i<=k; i++) {
        		for(int j =2; j<=n; j++) {
        			intArray[i][j]= intArray[i][j-1]+intArray[i-1][j];
        		}
        	}
        	System.out.println(intArray[k][n]);  
        }
    }
}