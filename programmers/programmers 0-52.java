import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr1 = arr.clone();
        do{
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=50 && arr[i]%2==0){
                    arr1[i] = arr[i]/2;
                }else if(arr[i]<50 && arr[i]%2==1){
                    arr1[i] = arr[i]*2+1;
                }else{
                    arr1[i] = arr[i];
                }
            }
            if(Arrays.equals(arr,arr1)){
                break;
            }else{
                arr = arr1.clone();
            }
            answer++;
        }while(Arrays.equals(arr,arr1));

        return answer;
    }
}