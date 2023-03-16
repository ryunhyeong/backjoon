import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

import java.util.Stack;

public class Main{
	

	static boolean []visited; //0번 index제외
	static ArrayList<Integer>[] arr;
	public static void main(String args[]) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	//Stack<Integer> stack = new Stack<>();
    	visited = new boolean[N+1];
    	arr= new ArrayList[N+1];
    	for(int i=1; i<=N; i++) {
    		arr[i]= new ArrayList<>(); 
    	}
    	//edge정보를 인접리스트에 넣는 부분
    	while(M--> 0) {
    		st = new StringTokenizer(br.readLine());
    		
    		int u = Integer.parseInt(st.nextToken());
        	int v = Integer.parseInt(st.nextToken());
        	arr[u].add(v);
        	arr[v].add(u);
    	}
    	int count = 0;
    	for(int i=1; i<N+1; i++) {
    		// 현재 방문하지 않는 노드이면 연결 요소의 갯수를 늘린다.
    		// 방문하지 않는 노드를 다시 DFS실행
    		if(!visited[i]) {
    			count++;
    			DFS(i);
    		}
    	}
    	System.out.println(count);
	}
	private static void DFS(int v) {
		// TODO Auto-generated method stub
		// 더이상 탐색하지 않는다.
		if(visited[v]) {
			return;
		}
		//방문하지 않는 노드를 방문처리
		visited[v]=true; 
		//현재 노드의 연결 노드 탐색 중 방문하지 않는 노드가 있다면
		//그 노드 기준으로 다시 DFS실행
		for(int i:arr[v]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
	}
}