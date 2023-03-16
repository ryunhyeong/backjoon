import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import java.util.Stack;

public class Main{
	
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static boolean [][]visited;
	static int[][] A;
	static int N,M;
	
	public static void main(String args[]) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	//Stack<Integer> stack = new Stack<>();
    	visited = new boolean[N][M];
    	A = new int[N][M];
    	for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken(); // 101101010
    		for(int j=0; j<M; j++) {
    			A[i][j] = Integer.parseInt(line.substring(j,j+1));  
    		}
    	}
    	BFS(0,0);
    	System.out.println(A[N-1][M-1]);
	}
	private static void BFS(int i, int j) {
		Queue<int[]>queue = new LinkedList<>();
		queue.offer(new int[] {i,j});  // 처음시작점이 [0,0]이다 대입
		// queue 빌때까지 (BFS탐색할수 없을때까지) 탐색
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			visited[i][j] = true;
			// 상하좌우 탐색하기 위함
			for(int k=0; k<4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				// 배열 밖으로 넘어가면 안됨
				if(x>=0 && y>=0 && x<N && y<M) {
					// 0이면 안됨, 방문했던적있으면 안됨
					if(A[x][y]!=0 && !visited[x][y]) {
						visited[x][y] = true;
						// 바로전 데이터의 값 +1
						A[x][y] = A[now[0]][now[1]] + 1; 
						// 새로운 좌표에 값 대입
						queue.add(new int[] {x,y});
					}
				}
			}
		}
	}
}