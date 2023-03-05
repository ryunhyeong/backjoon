import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		Stack<Character> ch = new Stack<Character>();
		int result = 0;
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)=='(') {
				ch.push('('); //'(' 단어 스택에 추가
				continue;
			}
			if(word.charAt(i)==')') {
				ch.pop(); //')' 등장시 pop
			
				if(word.charAt(i-1)=='(') {
					result += ch.size(); //'()'레이저 절단됬을때 앞에 잘린 막대수 만큼 증가
				}
				if(word.charAt(i-1)==')') {
					result++; //'))'이면 오른쪽에 막대 하나 추가됨
				}
			}
		}
		System.out.println(result);
	}
}