import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] strArr = myString.split("x");
        List<String> list = new ArrayList<String>();
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].isEmpty()){
                list.add(strArr[i]);
            }
        }
        String[] answer = new String[list.size()];
        list.toArray(answer);
        Arrays.sort(answer);
        return answer;
    }
}