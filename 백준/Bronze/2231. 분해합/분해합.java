import java.util.*;
import java.awt.Checkbox;
import java.io.*;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		boolean check = false;
		for(int i =0; i<N; i++) {
			int num = i;
			int sum = 0;
			sum += i;
			while(num != 0) {
				sum += num%10;
				num/=10;
			}
			if(N==sum) {
				System.out.println(i);
				check = true;
				break;
			}
		}
		if(!check) {
			System.out.println(0);
		}
	}
}

        				