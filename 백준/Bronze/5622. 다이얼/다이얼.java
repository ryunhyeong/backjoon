import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.security.DrbgParameters;
import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        String word = st.nextToken();
        // 'A' 아스키코드 = 65   'A'~'Z' -> 0~25로 변환
        int ascii_zero = 65;
        int count[] = new int[26];
        int sec = 3;
        for(int i = 0; i < 26; i++) {
        	if(i<=14) {
        		count[i]=sec;
        		if(i%3==2 && i!=0) {
        			sec++;
        		}
        	}
        	else {
        		count[i]=sec;
        		if(i==18||i==21) {
        			sec++;
        		}
        	}
        }
        int result=0;
        for(int k = 0; k<word.length(); k++) {
        	char ch = word.charAt(k);
        	result += count[(int) ch - ascii_zero];
        	
        }
        System.out.println(result);
    }
}