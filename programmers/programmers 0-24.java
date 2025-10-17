import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for(int i=0;i<my_string.length();i++){
            list.add(my_string.substring(i));
        }
        Collections.sort(list);
        answer = list.toArray(new String[0]);
        return answer;
    }
}

/*
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.legnth()];
        for(int i=0;i<my_string.length();i++){
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
*/