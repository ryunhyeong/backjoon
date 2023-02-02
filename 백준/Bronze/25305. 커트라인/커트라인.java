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
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int arr[] = new int[N];
        for(int i = 0; i<N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i<N-1;i++) {
        	for(int j =i+1; j<N; j++) {
        		if(arr[i]<arr[j]) {
        			int temp = arr[i];
        			arr[i]= arr[j];
        			arr[j]= temp; 
        		}
        	}
        }
        System.out.println(arr[k-1]);
    }
}
    