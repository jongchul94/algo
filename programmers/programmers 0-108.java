import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        List<String> list = new ArrayList<String>();
        for(int i=0;i<my_str.length();i=i+n){
            String str = "";
            if(my_str.length()>=i+n){
                str = my_str.substring(i,i+n);
            }else{
                str = my_str.substring(i);
            }
            list.add(str);
        }
        answer = list.toArray(new String[0]);
        return answer;
    }
}