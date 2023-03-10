class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int count[] = new int[n+1];
        for(int i:section){
            if(count[i]!=0) continue;
            if(i>n-m){
                answer++;
                break;
            }
            for(int j=i; j<i+m; j++){
                count[j]++;
            }
            answer++;
        }
        return answer;
    }
}