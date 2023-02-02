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
        //int k = Integer.parseInt(st.nextToken());
        //st = new StringTokenizer(bf.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        int arr[] = new int[10001];
        for(int i = 0; i<N; i++) {
        	arr[Integer.parseInt(bf.readLine())]++;
        }
        Collections.sort(arrayList);
        for(int i =1; i<10001;i++) {
        	while(arr[i]>0) {
        		sb.append(i).append('\n');
        		arr[i]--;
        	}
        }
        System.out.println(sb);
    }
}
    