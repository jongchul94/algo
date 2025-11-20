import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(list.size() == k){
                break;
            }
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        for(int j=0;j<k;j++){
            if(list.size() - 1 < j){
                answer[j] = -1;
            }else{
                answer[j] = list.get(j);
            }
        }
        
        return answer;
    }
}