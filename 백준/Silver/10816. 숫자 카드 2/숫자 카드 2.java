import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
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
    		sb.append(upperbound(arr_1, a) - lowerbound(arr_1, a)).append(' ');
    	}
    	System.out.println(sb);
	}
	
	private static int upperbound(int[] arr, int key) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = arr.length;
		
		while(low<high) {
			int mid = low + (high-low)/2;
			
			if(key < arr[mid]) {
				high = mid;
			}
			// upper은 중앙값과 key가 같으면 오른쪽을 살펴본다.
			else {
				low = mid+1;
			}
		}
		// mid+1바뀐값이 상한값
		return low;
	}

	private static int lowerbound(int[] arr, int key) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = arr.length;
		
		while(low<high) {
			int mid = low + (high-low)/2;
			
			if(key <= arr[mid]) {
				high = mid;
			}
			// upper은 중앙값과 key가 같으면 오른쪽을 살펴본다.
			else {
				low = mid+1;
			}
		}
		// mid+1바뀐값이 상한값
		return low;
	}
	
}