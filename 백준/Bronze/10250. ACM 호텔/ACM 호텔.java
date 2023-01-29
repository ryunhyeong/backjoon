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
        int T = Integer.parseInt(bf.readLine());
        while(T-- >0) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            
            int a = N / H+1;
            int b = N % H;
            String back = "";
            String front = "";
            
            //1번 손님
            if(N==1) {
            	System.out.println("101");
            	continue;
            }
            // 앞자리 층수에 들어가는경우  "x01"
            else if(N <= H) {
            	System.out.println(Integer.toString(N)+"01");
            }
            // 1층 밖에 없는 경우 "10x"
            else if(W==1) {
            	System.out.println("10"+Integer.toString(N));
            }
            // 나머지
            else {
            	if(b == 0) {
                	front = Integer.toString(H);
                	a = N / H;
                }
                else {
                	front = Integer.toString(b);
                }
                
                if(a<10) {
                	back = "0"+a;
                }
                else {
                	back = Integer.toString(a);
                }
                System.out.println(front+back);
            }
        }
    }
}