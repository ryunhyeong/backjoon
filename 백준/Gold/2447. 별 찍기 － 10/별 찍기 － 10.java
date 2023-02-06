import java.util.*;
import java.io.*;

public class Main{
	public static void star(String[][] A, int x, int y, int n) {
		if(n==1) {
			A[x][y]= "*";
			return;  
		}
		 for(int i=0; i<3; i++) {
        	for(int j =0; j<3; j++) {
        		if(!(i==1 && j==1)) {
        			star(A, x+i*n/3, y+j*n/3, n/3);
        		}
        	}
        }
	}
		 
    public static void main(String args[]) throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
    	int N = Integer.parseInt(bf.readLine());
        String arr[][] = new String[N][N];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = " ";
            }
        }
        
        star(arr, 0, 0, N);
        for (String[] strings : arr) {
            for (String string : strings) {
            	sb.append(string);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
        				