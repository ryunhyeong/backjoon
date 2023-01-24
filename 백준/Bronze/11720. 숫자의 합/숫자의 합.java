import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int alpha = Integer.parseInt(bf.readLine());
        String word = bf.readLine();
        int sum = 0;
        for(int i =0; i<alpha;i++) {
        	char one = word.charAt(i);
        	sum += one-'0';
        }
        
        System.out.println(sum);
    }
}