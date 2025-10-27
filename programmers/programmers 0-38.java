import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<intervals.length;i++){
            for(int j=intervals[i][0];j<=intervals[i][1];j++){
                list.add(arr[j]);
            }
        }
        int[] answer = new int[list.size()];
        for(int k=0;k<list.size();k++){
            answer[k] = list.get(k);
        }
        return answer;
    }
}