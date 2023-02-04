import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.channels.InterruptedByTimeoutException;
import java.security.DrbgParameters;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.IntPredicate;

import javax.naming.spi.DirStateFactory.Result;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine()); 
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[N];
        int[] sorted_arr = new int[N];
        HashMap<Integer, Integer> rankMap = new HashMap<Integer,Integer>();
        for(int i =0; i<N; i++) {
        	sorted_arr[i] = arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted_arr);
        
        int rank = 0;
        for(int i:sorted_arr) {
        	if(!rankMap.containsKey(i)) {
        		rankMap.put(i, rank);
	        	rank++;
        	}
        }
        
        for(int i:arr) {
        	sb.append(rankMap.get(i)+" ");
        }
        
        System.out.println(sb);
    }
}			
        				