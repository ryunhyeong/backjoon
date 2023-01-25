import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       
        int T = Integer.parseInt(bf.readLine());
        for(int i =0; i<T;i++) {
        	StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        	int S = Integer.parseInt(st.nextToken());
        	String word = st.nextToken();
        	
        	for(int j=0; j<word.length(); j++) {
        		int k = 0;
        		while(k<S) {
        			System.out.print(word.charAt(j));
        			k++;
        		}
        	}
        	System.out.println();
        }     
    }
}