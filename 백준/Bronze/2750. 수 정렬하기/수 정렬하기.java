import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

import java.util.Stack;

public class Main{
	public static void main(String args[]) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	int []arr = new int[N];
    	for(int i=0; i<N; i++) {
    		arr[i]=Integer.parseInt(br.readLine());
    	}
    	//버블 정렬 -- 인접한 두수 비교하여 스왑
    	for(int i=N-1; i>0; i--) {
    		for(int j=0; j<i; j++) {
    			if(arr[j]>arr[j+1]) {
    				int temp = arr[j];
    				arr[j] = arr[j+1];
    				arr[j+1] = temp;
    			}
    		}
    	}
    	StringBuilder sb = new StringBuilder();
    	for(int i:arr) {
    		sb.append(i).append('\n');
    	}
    	System.out.println(sb);
	}
}