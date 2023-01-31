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
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int array1[][] = new int[N][M];
        int array2[][] = new int[N][M];
        for(int i =0; i<N;i++) {
        	st = new StringTokenizer(bf.readLine());
        	for(int j = 0; j<M; j++) {
        		array1[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        for(int i =0; i<N;i++) {
        	st = new StringTokenizer(bf.readLine());
        	for(int j = 0; j<M; j++) {
        		array2[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        for(int i =0; i<N;i++) {
        	for(int j = 0; j<M; j++) {
        		System.out.print(array1[i][j]+array2[i][j]+" ");
        	}
        	System.out.println();
        }
    }
}
    