import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<intStrs.length;i++){
            int slice = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(slice>k){
                list.add(slice);
            }
        }
        int[] answer = new int[list.size()];
        for(int j=0;j<list.size();j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}