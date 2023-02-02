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
        int arr[] = new int[8001];
        int array[] = new int[N];
        double sum = 0;
        int min = 4001;
        int max = -4001;
        
        // midian(중앙) 과 more(빈도) 는 -4000~4000 을 제외한 수로 초기화
        int more = -5000;
        int midian = -5000;
        int count = 0;
        boolean flag = false;
        for(int i = 0; i<N; i++) {
        	int a = Integer.parseInt(bf.readLine());
        	sum += a;
        	arr[a+4000]++;
        	if(max<a) {
        		max = a;
        	}
        	if(min>a) {
        		min = a;
        	}
        }
        double avg = sum/N;
        int more_max = 0;
        Collections.sort(arrayList);
        for(int i =min+4000; i<=max+4000;i++) {
        	if(arr[i]>0) {
        		if(count < (N+1)/2) {
        			count+= arr[i];
        			midian = i - 4000;
        		}
        		
        		if(more_max<arr[i]) {
            		more_max = arr[i];
            		more = i - 4000;
            		flag = true;
            	}
            	else if(more_max==arr[i] && flag==true ) {
            		more = i - 4000;
            		flag = false;
            	}
        	}        	
        }
        System.out.println((int)Math.round(avg));
        System.out.println(midian);
        System.out.println(more);
        System.out.println(max-min);
    }
}
    
        		
 
        				
   



        				
        				