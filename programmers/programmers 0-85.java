import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);
        BigInteger sum = a1.add(b1);
        String answer = sum.toString();
        return answer;
    }
}




import java.util.*;

class Solution {
    public String solution(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int limit = a.length() > b.length() ? a.length() : b.length();
        int gap = a.length() > b.length() ? a.length() - b.length() : b.length() - a.length();
        int sum = 0;
        if(a.length() > b.length()){
            limit = a.length();
            gap = a.length() - b.length();
            for(int j=0;j<gap;j++){
                b = "0"+b;
            }
        }else if(b.length() > a.length()){
            limit = b.length();
            gap = b.length() - a.length();
            for(int j=0;j<gap;j++){
                a = "0"+a;
            }
        }else{
            limit = a.length();
        }
        for(int i=0;i<limit;i++){
            int a1 = Character.getNumericValue(a.charAt(i));
            int b1 = Character.getNumericValue(b.charAt(i));
            int sum2 = a1 + b1;
            if(i != limit-1){
                sum = 10*sum;
                sum2 = 10*sum2;
            }
            sum += sum2;
        }
        sb.append(sum);
        String answer = sb.toString();
        return answer;
    }
}