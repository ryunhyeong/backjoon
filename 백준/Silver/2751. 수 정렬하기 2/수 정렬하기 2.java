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
import java.util.List;
import java.util.StringTokenizer;

import javax.naming.spi.DirStateFactory.Result;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arrayList = new ArrayList<>();
        int arr[] = new int[N];
        for(int i = 0; i<N; i++) {
        	arrayList.add(Integer.parseInt(bf.readLine()));
        }
        Collections.sort(arrayList);
        for(int k :arrayList) {
        	sb.append(k).append('\n');
        }
        System.out.println(sb);
    }
}
    