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
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean[] prime_check = new boolean[b+1];
        prime_check[0]=prime_check[1] = true;
        // i -> i * i 바꾸기
    	for(int i = 2; i*i<prime_check.length; i++) {
    		// 소수가 아니라면 숫자 넘기기
    		if(prime_check[i]) {
    			continue;
    		}
    		// i배수들을 걸러주기 위함 2,4,6,8 // 7,14,21,28 ...
    		for(int j = i*i; j <= b; j=j+i) {
    			prime_check[j]= true;
    		}
    	}
    	for(int k = a; k <=b; k++) {
    		if(!prime_check[k]) {
    			System.out.println(k);
    		}
    	}
    	
    }
}
    