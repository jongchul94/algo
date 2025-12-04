class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int ameCnt = 0;
        int latteCnt = 0;
        for(int i=0;i<order.length;i++){
            if(order[i].indexOf("latte") != -1){
                latteCnt++;
            }else{
                ameCnt++;
            }
        }
        answer = latteCnt * 5000 + ameCnt * 4500;
        return answer;
    }
}