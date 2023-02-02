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
        StringBuilder sb = new StringBuilder();
        String number = bf.readLine();
        int arr[] = new int[10];
        for(int i =0; i<number.length(); i++) {
        	int a = number.charAt(i) - '0';
        	arr[a]++;
        }
        for(int i =9; i>=0; i--) {
        	if(arr[i]>0) {
        		while(arr[i]>0) {
            		System.out.print(i);
            		arr[i]--;
        		}
        	}
        }
    }
}
    
        		
 
        				
   



        				
        				