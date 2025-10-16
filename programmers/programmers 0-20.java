class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] charArr = my_string.toCharArray();
        for(int i=0;i<queries.length;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            while(left<right){
                char temp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = temp;
                left++;
                right--;
            }
        }
        String answer = new String(charArr);
        return answer;
    }
}

/*
class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < queries.length; i++) {
            sb.append(my_string.substring(queries[i][0], queries[i][1]+1));
            my_string = my_string.substring(0, queries[i][0]) + sb.reverse() + my_string.substring(queries[i][1] + 1);
            sb.setLength(0);
        }
        return my_string;
    }
}
*/