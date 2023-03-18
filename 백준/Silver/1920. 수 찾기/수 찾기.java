import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.util.Stack;


public class Main{
	static StringBuilder sb = new StringBuilder();
	public static void main(String args[]) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	
    	int N = Integer.parseInt(br.readLine());
    	int arr_1[] = new int[N];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	for(int i =0; i<N; i++) {
    		arr_1[i]= Integer.parseInt(st.nextToken());
    	}
    	int M = Integer.parseInt(br.readLine());
    	st = new StringTokenizer(br.readLine());
    	Arrays.sort(arr_1);
    	for(int i =0; i<M; i++) {
    		int a = Integer.parseInt(st.nextToken());
    		search(arr_1, 0, N-1, a);
    	}
    	System.out.println(sb);
	}
	
	private static void search(int[] arr, int start, int end, int key) {
		// TODO Auto-generated method stub
		if(start>end) {
			sb.append(0).append('\n');
			return;
		}
		else {
			int mid = (start + end)/2;
			if(arr[mid] == key) {
				sb.append(1).append('\n');
				return;
			}
			else if(arr[mid] > key) {
				search(arr, start, mid-1,key);
			}
			else if(arr[mid] < key) {
				search(arr, mid+1, end, key);
			}
		}
		return;
	}
}