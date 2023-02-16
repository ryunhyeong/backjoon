import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deq = new ArrayDeque<>();
		int num = -2;
		Stack<int[]> num_stack = new Stack<int[]>();
		while(N--> 0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String command = st.nextToken();
			
			switch (command) {
			case "push_back":
				num = Integer.parseInt(st.nextToken());
				deq.offerLast(num);
				break;
			case "push_front":
				num = Integer.parseInt(st.nextToken());
				deq.offerFirst(num);
				break;
			case "front":
				if(!deq.isEmpty()) {
					sb.append(deq.peekFirst()).append('\n');
				}
				else {
					sb.append("-1").append('\n');
				}
				break;
			case "back":
				if(!deq.isEmpty()) {
					sb.append(deq.peekLast()).append('\n');
				}
				else {
					sb.append("-1").append('\n');
				}
				break;
			case "size":
				sb.append(deq.size()).append('\n');
				break;
			case "empty":
				if(!deq.isEmpty()) {
					sb.append("0").append('\n');
				}
				else {
					sb.append("1").append('\n');
				}
				break;
			case "pop_front":
				if(!deq.isEmpty()) {
					sb.append(deq.pollFirst()).append('\n');
				}
				else {
					sb.append("-1").append('\n');
				}
				break;
			case "pop_back":
				if(!deq.isEmpty()) {
					sb.append(deq.pollLast()).append('\n');
				}
				else {
					sb.append("-1").append('\n');
				}
				break;
				}
			}
		System.out.println(sb);
	}
}