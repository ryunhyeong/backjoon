import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<int[]> num_stack = new Stack<int[]>();
		
		for(int i=1; i<=N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num_stack.isEmpty()) {
				sb.append("0 ");
			}
			else if(num_stack.peek()[0]<num) {
				while(!num_stack.isEmpty()) {
					num_stack.pop();
					if(num_stack.isEmpty()) {
						sb.append("0 ");
						break;
					}
					if(num_stack.peek()[0]>=num) {
						sb.append(num_stack.peek()[1]+" ");
						break;
					}
				}
			}
			else if(num_stack.peek()[0]>=num) {
				sb.append(num_stack.peek()[1]+" ");
			}
			num_stack.push(new int[] {num,i});
		}
		System.out.println(sb);
	}
}