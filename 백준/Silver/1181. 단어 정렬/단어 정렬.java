import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.security.DrbgParameters;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.IntPredicate;

import javax.naming.spi.DirStateFactory.Result;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //int N = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        String[] word_list = new String[N];
        
        for(int i =0; i<N; i++) {
        	word_list[i] = bf.readLine();
        }
        Arrays.sort(word_list, new Comparator<String>() {
        	@Override
        	public int compare(String s1, String s2) {
        		if(s1.length()==s2.length()) {
        			return s1.compareTo(s2); //s1(abcd) - s2(ab) = 2 양수이면 순서 변경
        		}
        		else {
        			return s1.length()-s2.length();
        		}
        	}
		});
        //앞글자와 비교해서 중복아니면 출력 (남꺼도움)
        //나는 0부터 뒷글자 비교했기떄문에 까다로웠음..
        sb.append(word_list[0]).append('\n');
        for(int i = 1; i<N; i++) {
        	if(!word_list[i].equals(word_list[i-1])) {
        		sb.append(word_list[i]).append('\n');
        	}
        }
        System.out.println(sb);
    }
}			
        				