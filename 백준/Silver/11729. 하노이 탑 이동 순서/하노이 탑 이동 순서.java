import java.util.*;
import java.io.*;

public class Main{
	public static StringBuilder sb = new StringBuilder();
	static int count =0;
	
	public static void hanoi(int N, int start, int mid, int to) {
		if(N==1) {
			sb.append(start + " " + to+"\n");
			count++;
			return;
		}
		
		// 가장 큰 블록 전까지의 블록 가운데로 이동
		hanoi(N-1, start, to, mid);
		
		// 가장 큰 블록 끝으로 이동
		sb.append(start+" "+to+"\n");
		count++;
		
		// 가장 큰 블록 전까지의 블룩 가운데에서 끝으로 이동
		hanoi(N-1, mid, start, to);
		}
	
		 
    public static void main(String args[]) throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(bf.readLine());
    	hanoi(N, 1, 2, 3);
    	System.out.println(count);
    	System.out.println(sb);
    }
}
        				