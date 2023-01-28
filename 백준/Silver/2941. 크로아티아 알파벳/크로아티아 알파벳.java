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
        String word = bf.readLine();
        int word_count = 0;
        int now_pos = 0;
        int word_pos = 1;
        boolean d_cotia = false;
        while(true){
        	if(d_cotia) {
        		break;
        	}
            if(now_pos==word.length()-1){
                word_count++;
                break;
            }
        	if(now_pos>word.length()-1) {
        		break;
        	}
        	char C = word.charAt(now_pos);
        	switch(C) {
        	case 'c':
        		if(word.charAt(word_pos)=='-' || word.charAt(word_pos)=='=') {
        			now_pos +=2;
        			word_pos +=2;
        			word_count++;
        		}
        		else {
        			now_pos +=1;
        			word_pos +=1;
        			word_count++;
        		}
        		continue;
        	case 'd':
        		if(word.charAt(word_pos)=='z'){
        			if(word_pos+1>=word.length()) {
            			word_count+=2;
            			d_cotia = true;
            			break;
        			}
        			if(word.charAt(word_pos+1)=='=')
        			{
        				now_pos +=3;
            			word_pos +=3;
            			word_count+=1;
        			}
            		else {
            			now_pos +=2;
            			word_pos +=2;
            			word_count+=2;
            		}
        		}
        		else if(word.charAt(word_pos)=='-') {
        			now_pos +=2;
        			word_pos +=2;
        			word_count++;
        		}
        		else {
        			now_pos +=1;
        			word_pos +=1;
        			word_count++;
        		}
        		continue;
        		
        	case 'l':
        		if(word.charAt(word_pos)=='j') {
        			now_pos +=2;
        			word_pos +=2;
        			word_count++;
        		}
        		else {
        			now_pos +=1;
        			word_pos +=1;
        			word_count++;
        		}
        		continue;
        	case 'n':
        		if(word.charAt(word_pos)=='j') {
        			now_pos +=2;
        			word_pos +=2;
        			word_count++;
        		}
        		else {
        			now_pos +=1;
        			word_pos +=1;
        			word_count++;
        		}
        		continue;
        	case 's':
        		if(word.charAt(word_pos)=='=') {
        			now_pos +=2;
        			word_pos +=2;
        			word_count++;
        		}
        		else {
        			now_pos +=1;
        			word_pos +=1;
        			word_count++;
        		}
        		continue;
        	case 'z':
        		if(word.charAt(word_pos)=='=') {
        			now_pos +=2;
        			word_pos +=2;
        			word_count++;
        		}
        		else {
        			now_pos +=1;
        			word_pos +=1;
        			word_count++;
        		}
        		continue;
        	default:
    			now_pos ++;
        		word_pos++;
    			word_count++;
        		continue;
        	}
        
        }
        System.out.println(word_count);
    }
}