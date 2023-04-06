import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String num_word = br.readLine();
      char word = num_word.charAt(0);
      int zero_count = 0; // 0->1 바뀔떄 카운트
      int one_count = 0; // 1->0 바뀔떄 카운트
      for(int i=1; i<num_word.length(); i++) {
    	  char next_word = num_word.charAt(i);
    	  if(word != next_word) {
    		  if(word=='1') {
    			  one_count++;
    		  }
    		  else {
    			  zero_count++;
    		  }
    		  word = next_word;
    	  }
      }
      if(word == '0') {
    	  zero_count++;
      }
      else {
    	  one_count++;
      }
      System.out.println(Math.min(zero_count,one_count));
    }
}