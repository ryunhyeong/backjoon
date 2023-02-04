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
        StringTokenizer st; 
        int N = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        String[][] word_list = new String[N][2];
        for(int i =0; i<N; i++) {
        	st = new StringTokenizer(bf.readLine());
        	word_list[i][0] = st.nextToken();
        	word_list[i][1] = st.nextToken();
        }
        //이전문제는 int[] 이번엔 String[] -> T로 설정
        Arrays.sort(word_list, new Comparator<String[]>() {
        	@Override
        	public int compare(String[] s1, String[] s2) {
        		return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);	
        	}
        });
        for(int i = 0; i<N; i++) {
        	sb.append(word_list[i][0]+ " " + word_list[i][1] +'\n');
        }
        System.out.println(sb);
    }
}			
        				