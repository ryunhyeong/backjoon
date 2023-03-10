class Solution {
    public int solution(int[][] lines) {
        int answer = 0;

        int count[] = new int[200];
        for(int i=0; i<3; i++){
            for(int j = lines[i][0]; j<lines[i][1]; j++){
                count[j+100]++;
            }
        }
        for(int i: count){
            if(i>1){
                answer++;
            }
        }
        
        return answer;
    }
}