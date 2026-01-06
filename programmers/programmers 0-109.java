class Solution {
    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<array.length;i++){
            sb.append(array[i]);
        }
        String st = sb.toString();
        char[] ch = st.toCharArray();
        for(int j=0;j<ch.length;j++){
            if(ch[j] == '7'){
                answer++;
            }
        }
        return answer;
    }
}


class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int a : array){
            while(a != 0){
                if(a % 10 == 7){
                    answer++;
                }
                a /= 10;
            }
        }
        return answer;
    }
}