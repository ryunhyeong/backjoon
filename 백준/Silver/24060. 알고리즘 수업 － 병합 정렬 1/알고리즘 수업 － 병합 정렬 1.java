import java.util.*;
import java.io.*;

public class Main{
	static int count = 0;
	static int result = -1;
	static int K;
	static int[] temp;
	public static void mergesort(int[] A, int p, int r){
		if(count>K) {
			return;
		}
		if(p<r) {
			int q = (p+r) / 2;
			mergesort(A, p, q);
			mergesort(A, q+1, r);
			merge(A,p, q, r);
		}
	}
	
	public static void merge(int[] A, int p, int q, int r) {
		int i = p;
		int j = q+1;
		int t = 0;
		while(i<=q && j<=r){
			if(A[i]>A[j]) {
				temp[t++] = A[j++]; //왼쪽배열에 값이 큰경우 
			}
			else {
				temp[t++] = A[i++]; //오른쪽 배열에 값이 큰경우
			}
		}
		while(i<=q) {
			temp[t++] = A[i++];
		}
		while(j<=r) {
			temp[t++] = A[j++];
		}
		t = 0;
		while(p <= r) {
			count++;
			if(count == K) {
				result = temp[t];
				break;
			}
			A[p++] = temp[t++];
			
		}
		
	}
    
    public static void main(String args[]) throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int A[] = new int[N];
        temp = new int[N];
    	st = new StringTokenizer(bf.readLine());
        for(int i =0; i<N; i++) {
        	A[i] = Integer.parseInt(st.nextToken());
        }
        mergesort(A, 0, A.length-1);

        System.out.println(result);
    }
}
        				