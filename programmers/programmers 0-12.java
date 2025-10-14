import java.util.*;

// *****
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=l;i<=r;i++){
            char[] charArr = Integer.toString(i).toCharArray();
            boolean bool = true;
            for(int j=0;j<charArr.length;j++){
                if(charArr[j] != '0' && charArr[j] != '5'){
                    bool = false;
                }
            }
            if(bool){
                list.add(i);
            }
        }
        int[] answer;
        if(list.isEmpty()) {
            answer = new int[] {-1};
        } else {
            answer = new int[list.size()];
            
            for(int i=0;i<list.size();i++) {
            	answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}