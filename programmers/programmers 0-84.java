class Solution {
    public String solution(String n_str) {
        int str = Integer.parseInt(n_str);
        String answer = "" + str;
        return answer;
    }
}


class Solution {
    public String solution(String n_str) {
        StringBuilder sb = new StringBuilder(n_str);

        while (sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}