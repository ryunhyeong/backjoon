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
        int num = Integer.parseInt(bf.readLine());
    	int word_count = 0;
        for(int i =0; i<num; i++) {
        	String word = bf.readLine();
        	
        	for(int j = 0; j<word.length()-1; j++) {
        		int same_count = 1;
        		char C = word.charAt(j);
        		int first_index = word.indexOf(C);
        		int last_index = word.lastIndexOf(C);
        		int word_number = last_index-first_index+1;
        		for(int k = j+1; k<word.length(); k++) {
        			if(C==word.charAt(k)) {
        				j++;
        				same_count++;
        			}
        		}
        		if(same_count!=word_number) {
                	word_count--;
        			break;
        		}
        	}
        	word_count++;
        }
        System.out.println(word_count);
    }
}