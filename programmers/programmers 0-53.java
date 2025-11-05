class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int idx = 0;
        int length = num_list.length;
        while(true){
            if(num_list[idx] == 1){
                idx++;
            }else if(num_list[idx]%2 == 0){
                num_list[idx] = num_list[idx]/2;
                answer++;
            }else if(num_list[idx]%2 == 1){
                num_list[idx] = (num_list[idx]-1)/2;
                answer++;
            }
            if(idx==length){
                break;
            }
        }
        return answer;
    }
}