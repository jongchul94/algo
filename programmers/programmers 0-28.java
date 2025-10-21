import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0,s));
        for(int i=e;i>=s;i--){
            sb.append(my_string.charAt(i));
        }
        sb.append(my_string.substring(e+1));
        answer = sb.toString();
        return answer;
    }
}

/*
class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
        answer.reverse();
        return my_string.substring(0, s) + answer + my_string.substring(e + 1);
    }
}
*/