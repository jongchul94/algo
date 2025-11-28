import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<Integer>();
        for(int k=0;k<arr.length;k++){
            list.add(arr[k]);
        }
        for(int i=0;i<delete_list.length;i++){
            if(list.contains(delete_list[i])){
                int idx = list.indexOf(delete_list[i]);
                list.remove(idx);
            }
        }
        int[] answer = new int[list.size()];
        for(int j=0;j<list.size();j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}