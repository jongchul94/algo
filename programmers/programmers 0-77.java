class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] lenArr = new int[30];
        for(int i=0;i<strArr.length;i++){
            int len = strArr[i].length();
            lenArr[len-1] = lenArr[len-1]+1;
        }
        for(int j=0;j<lenArr.length;j++){
            if(lenArr[j]>answer){
                answer = lenArr[j];
            }
        }
        return answer;
    }
}


class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] lenArr = new int[30];
        for(int i=0;i<strArr.length;i++){
            int len = strArr[i].length();
            lenArr[len-1] = lenArr[len-1]+1;
            answer = Math.max(answer, lenArr[len-1]);
        }
        return answer;
    }
}