class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int index = myString.indexOf(pat);
        while(index != -1){
            index = myString.indexOf(pat,index+1);
            answer++;
        }
        return answer;
    }
}