class Solution {
    public String solution(String code) {
        String answer = "EMPTY";
        int mode = 0;
        String ret = "";
        for(int i=0;i<code.length();i++){
            char c = code.charAt(i);
            
            if(c == '1'){
                mode = mode == 0 ? 1 : 0;
            }else if((mode == 0 && i%2 == 0) || (mode == 1 && i%2 == 1)){
                ret += c;
            }
        }
        if(ret != ""){
            answer = ret;
        }
        return answer;
    }
}

/*
class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for(int i=0;i<code.length();i++){
            char c = code.charAt(i);
            
            if(c == '1'){
                mode = mode == 0 ? 1 : 0;
                continue;
            }
            
            if(i%2 == mode){
                answer += c;
            }
        }
        answer = answer.equals("") ? "EMPTY" : answer;
        return answer;
    }
}
*/