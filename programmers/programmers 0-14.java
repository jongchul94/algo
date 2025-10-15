import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<Integer>();
        do{
            list.add(n);
            if(n%2==0){
                n = n/2;
            }else if(n%2==1){
                n = 3*n+1;
            }
        }while(n!=1);
        list.add(n);
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}