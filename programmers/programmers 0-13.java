import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=start_num;i<=end_num;i++){
            list.add(i);
        }
        int[] answer = new int[list.size()];
        for(int j=0;j<list.size();j++){
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}