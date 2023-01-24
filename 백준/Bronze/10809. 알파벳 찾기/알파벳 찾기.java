import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //int alpha = Integer.parseInt(bf.readLine());
        String word = bf.readLine();
        int sum = 0;
        int num[] = new int[26];
        boolean bool[] = new boolean[26];
        for(int i =0; i<word.length();i++) {
        	char one = word.charAt(i);
        	if(bool[one-'a']) {
        		continue;
        	}
        	num[one-'a']=i;
        	bool[one-'a']=true;
        }
        for(int k=0; k<26;k++) {
        	if(bool[k]) {
        		System.out.print(num[k]+" ");
        	}
        	else if(!bool[k]){
        		System.out.print(-1+" ");
        	}
        	
        }
        
    }
}