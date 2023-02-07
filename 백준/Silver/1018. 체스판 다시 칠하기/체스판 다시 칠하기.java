import java.util.*;
import java.awt.Checkbox;
import java.io.*;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char arr1[][] = new char[N][M];
		for(int i=0; i<N; i++) {
			String word = bf.readLine();
			for(int j=0; j<M; j++) {
				arr1[i][j] = word.charAt(j);
			}
		}
		
		// arr2로 깊은복사
		char[][] arr2 = new char[N][M]; 
		for(int i = 0; i < N; i++){ // 2중 반복문
			for(int j = 0 ; j < M; j++){
				arr2[i][j] = arr1[i][j];
			}
		}
		
		//arr1 시작이(짝수) B인것 (홀수)W인것 
        //틀린 부분 -> 1 맞은 부분 ->0
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if((i+j)%2==0 && arr1[i][j]=='W'){
					arr1[i][j]='1';
				}
				else if((i+j)%2!=0 && arr1[i][j]=='W'){
					arr1[i][j]='0';
				}
				else if((i+j)%2!=0 && arr1[i][j]=='B'){
					arr1[i][j]='1';
				}
				else if((i+j)%2==0 && arr1[i][j]=='B'){
					arr1[i][j]='0';
				}
			}
		}
		
		//arr2시작이(짝수) W인것 (홀수)B인것 
        //틀린 부분 -> 1 맞은 부분 ->0
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if((i+j)%2==0 && arr2[i][j]=='B'){
					arr2[i][j]='1';
				}
				else if((i+j)%2!=0 && arr2[i][j]=='B'){
					arr2[i][j]='0';
				}
				else if((i+j)%2!=0 && arr2[i][j]=='W'){
					arr2[i][j]='1';
				}
				else if((i+j)%2==0 && arr2[i][j]=='W'){
					arr2[i][j]='0';
				}
			}
		}
		
		int min_sum1=100000; //홀수 B, 짝수 W
		int min_sum2=100000; //홀수 W, 짝수 B
        //8칸씩 비교
		for(int i = 0; i<N-7; i++) {
			for(int j=0; j<M-7; j++) {
				int sum1 =0;
				int sum2 =0;
				for(int ii=0; ii<8; ii++) {
					for(int jj=0; jj<8; jj++) {
						sum1 += arr1[i+ii][j+jj]-'0';
						sum2 += arr2[i+ii][j+jj]-'0';
					}
				}
                //8*8값 arr1 최소
				if(min_sum1>sum1) {
					min_sum1 = sum1;
				}
                //8*8값 arr2 최소
				if(min_sum2>sum2) {
					min_sum2 = sum2;
				}
			}
		}
		int result =Math.min(min_sum1, min_sum2);

		System.out.println(result);
	}
}

        				