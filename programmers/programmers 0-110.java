import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String dump = my_string.toLowerCase();
        char[] chArr = dump.toCharArray();
        Arrays.sort(chArr);
        answer = new String(chArr);
        return answer;
    }
}