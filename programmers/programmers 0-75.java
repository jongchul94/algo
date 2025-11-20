import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int size = 1;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=10;i++){
            if(arr.length<=Math.pow(2,i) && arr.length>Math.pow(2,i-1)){
                size = (int)Math.pow(2,i);
                break;
            }
        }
        int[] answer = new int[size];
        for(int j=0;j<size;j++){
            if(arr.length-1<j){
                answer[j] = 0;
            }else{
                answer[j] = arr[j];
            }
        }
        return answer;
    }
}




class Solution {
    public int[] solution(int[] arr) {
        int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    }
}