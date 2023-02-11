import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		Stack<String> stack = new Stack<String>(); 
		
		int N = Integer.parseInt(st.nextToken());
		while(N--> 0) {
			StringBuilder sb = new StringBuilder();
			st = new StringTokenizer(bf.readLine());
			while(st.hasMoreTokens()) {
				String word = st.nextToken();
				for(int i =0; i<word.length(); i++) {
					stack.push(word.substring(i,i+1));
				}
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sb.append(" ");
			}
			System.out.println(sb);
		}
		
	}
}