import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.security.DrbgParameters;
import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //int N = Integer.parseInt(bf.readLine());
        int array1[][] = new int[9][9];
        int max = 0;
        int a = 0,b =0;
        for(int i =0; i<9;i++) {
        	StringTokenizer st = new StringTokenizer(bf.readLine());
        	for(int j = 0; j<9; j++) {
        		array1[i][j] = Integer.parseInt(st.nextToken());
        		if(max<array1[i][j]) {
        			max = array1[i][j];
        			a=i;
        			b=j;
        		}
        	}
        }
        System.out.println(max);
        System.out.printf("%d %d",a+1,b+1);
    }
}
    