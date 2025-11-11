import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] strArr = myString.split("x");
        List<String> list = new ArrayList<String>(Arrays.asList(strArr));
        if(myString.lastIndexOf("x") == myString.length()-1){
            list.add("");
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i).length();
        }
        return answer;
    }
}