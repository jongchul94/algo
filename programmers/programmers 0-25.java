import java.util.Arrays;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] suffix = new String[my_string.length()];
        for(int i=0;i<my_string.length();i++){
            suffix[i] = (my_string.substring(i));
        }
        answer = Arrays.asList(suffix).contains(is_suffix) ? 1 : 0;
        return answer;
    }
}

/*
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        for(int i=0;i<my_string.length();i++){
            if(is_suffix.equals(my_string.substring(i))){
                return 1;
            }
        }
        return answer;
    }
}
*/