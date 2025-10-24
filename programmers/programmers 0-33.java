class Solution {
    public String solution(String my_string, int[] indices) {
        char[] charArr = my_string.toCharArray();
        for(int i=0;i<indices.length;i++){
            charArr[indices[i]] = ' ';
        }
        String answer = new String(charArr);
        answer = answer.replace(" ", "");
        return answer;
    }
}