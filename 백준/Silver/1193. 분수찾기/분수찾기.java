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
        int N = Integer.parseInt(bf.readLine());
        int num = 1;
        int plus_num = 1;
        // 1일때 1/1 출력
        while(true) {
        	if(N==1) {
        		System.out.println(N+"/"+N);
        		break;
        	}
            // 한 대각선당 한 그룹
            // 그룹당 분수갯수 -> 1, 2, 3, 4, 5개 ... 
            // 총갯수 1,3,6,10,15... 증가한 분수 갯수 1,2,3,4,5 ...
            // 분모, 분자 숫자 합 = 증가한 분수 갯수 + 1
        	else {
        		if(N<=num) {
        			int a = N - (num - plus_num);
    				int b = plus_num+1 - a;
        			if(plus_num%2==0) {
        				System.out.println(a+"/"+b);
        				break;
        			}
        			else {
        				System.out.println(b+"/"+a);
        				break;
        			}
        		}
        		else {
        			plus_num++;
        			num= num+plus_num;
        		}
        	}
        }
    }
}