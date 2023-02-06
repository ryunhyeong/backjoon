import java.util.*;
import java.awt.Checkbox;
import java.io.*;

public class Main{
	static int search(int[] arr, int N, int M) {
		int Max_sum = 0;
		for(int i=0; i<N-2; i++) {
			if(arr[i]>M) continue;
			for(int j=i+1; j<N-1; j++) {
				if(arr[i]+arr[j]>M) continue;
				Loop3:
				for(int k=j+1; k<N; k++) {
					int sum = arr[i]+arr[j]+arr[k];
					
					if(sum>Max_sum && sum<M) {
						Max_sum = sum;
						}
					if(sum==M){
						return sum;
						}
					}
				}
			}
		return Max_sum;
		}
	
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {
			arr[i]= Integer.parseInt(st.nextToken()); 
		}
		int result = search(arr, N, M);
		System.out.println(result);
	}
}

        				