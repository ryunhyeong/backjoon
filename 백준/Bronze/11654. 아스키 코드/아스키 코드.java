import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String alpha = bf.readLine();
        char one = alpha.charAt(0);
        System.out.println(one-0);
    }
}