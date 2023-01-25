import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       //대문자 + 32 == 소문자(아스키코드)
        // A~Z 65~90 a~z 97~122
        int count[] = new int[26];
        String word = bf.readLine();
        for(int i = 0; i<word.length(); i++) {
        	int pos = (int) word.charAt(i);
        	if(pos>=97 && pos<=122) {
        		pos -= 32;
        	}
        	count[pos-65]++;
        }
        int max = 0;
        char ch = '?';
        for(int i = 0; i <count.length; i++) {
        	if(count[i]>max) {
        		max = count[i];
        		ch = (char)(i+65);
        	}
        	else if(count[i]==max) {
        		ch = '?';
        	}
        }
        System.out.println(ch);
  
    }
}