class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int add = 0;
        for(int i=0;i<num_list.length;i++){
            mul *= num_list[i];
            add += num_list[i];
        }
        if(add*add>mul){
            answer = 1;
        }
        return answer;
    }
}