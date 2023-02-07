import java.util.*;
import java.awt.Checkbox;
import java.io.*;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(bf.readLine());
		int arr[][] = new int[N][N];
		for(int i = 0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[i][0] = x;
			arr[i][1] = y;
		}
		for(int i = 0; i<N; i++) {
			int count = 1; 
			for(int j = 0; j<N; j++) {
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {
					count++;
				}
			}
			sb.append(count + " ");
		}
		System.out.println(sb);
	}
}

        				