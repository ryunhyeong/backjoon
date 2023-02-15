import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] num_arr = new int[N];
		StringBuilder sb = new StringBuilder();
		Stack<Integer> num_stack = new Stack<Integer>();
		
		for(int i=0; i<N; i++) {
			num_arr[i] = Integer.parseInt(bf.readLine()); 
		}
		
		int pos = 0;
		for(int i:num_arr) {
			if(i>pos) {
				for(int k=pos+1; k<=i; k++) {
					num_stack.push(k);
					sb.append("+"+'\n');
				}
				pos = i;
			}
			else if(num_stack.peek()!=i) {
				System.out.println("NO");
				return;
			}
			num_stack.pop();
			sb.append("-"+'\n');
		}
		System.out.println(sb);
	}
}