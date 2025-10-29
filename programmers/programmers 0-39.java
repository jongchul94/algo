import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        int firstIdx = -1;
        int lastIdx = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 2){
                firstIdx = firstIdx == -1 ? i : firstIdx;
                lastIdx = i;
            }
        }
        
        if(firstIdx == -1){
            list.add(-1);
        }else if(firstIdx == lastIdx){
            list.add(2);
        }else{
            for(int i=firstIdx;i<=lastIdx;i++){
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int j=0;j<list.size();j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}