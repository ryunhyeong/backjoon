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
        int N = Integer.parseInt(bf.readLine());
        while(N-- > 0) {
        	int a = Integer.parseInt(bf.readLine());
            boolean[] prime_check = new boolean[a+1];
            prime_check[0]=prime_check[1] = true;
            
            for(int i = 2; i*i<prime_check.length; i++) {
        		// 소수가 아니라면 숫자 넘기기
        		if(prime_check[i]) {
        			continue;
        		}
        		// i배수들을 걸러주기 위함 2,4,6,8 // 7,14,21,28 ...
        		for(int j = i*i; j <= a; j=j+i) {
        			prime_check[j]= true;
        		}
            }
            // 딱 절반값이 소수일때
            int half_a = a/2;
            if(!prime_check[half_a])
            	System.out.printf("%d %d\n",half_a, half_a);
            // 절반값 +1, 절반값 -1 이 소수일 지점 찾기
            else{
            	for(int j = 1; j<half_a; j++) {
            		if(!prime_check[half_a-j] && !prime_check[half_a+j]) {
            			System.out.printf("%d %d\n",half_a-j,half_a+j);
            			break;
            		}
            	}
            }
        }
    }
}
    