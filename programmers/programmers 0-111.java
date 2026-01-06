class Solution {
    public int solution(int n, int t) {
        int answer = n*(int)Math.pow(2,t);
        return answer;
    }
}



class Solution {
    public int solution(int n, int t) {
        int answer = 0;

        answer = n << t;

        return answer;
    }
}