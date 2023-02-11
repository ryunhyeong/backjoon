import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static String check(String word) {
		int count = 0;
		for(char c: word.toCharArray()) {
			if(c=='(') {
				count++;
			}
			else if(count<=0) {
				return "NO";
			}
			else {
				count--;
			}
		}
		if(count==0) {
			return "YES";
		}
		else {
			return "NO";
		}
	}
	
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(bf.readLine());
		while(N--> 0) {
			sb.append(check(bf.readLine())).append('\n');
		}
		System.out.println(sb);
	}
}