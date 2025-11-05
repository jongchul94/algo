class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        if(num_list.length>10){
            for(int i=0;i<num_list.length;i++){
                answer += num_list[i];
            }
            answer--;
        }else if(num_list.length<=10){
            for(int j=0;j<num_list.length;j++){
                answer *= num_list[j];
            }
        }
        return answer;
    }
}