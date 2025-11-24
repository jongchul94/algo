class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        int len = arr.length%2==0 ? arr.length/2 : arr.length/2+1;
        for(int i=0;i<len;i++){
            if(arr.length%2==0){
                arr[2*i+1] += n;
            }else{
                arr[2*i] += n;
            }
        }
        return arr;
    }
}


class Solution {
    public int[] solution(int[] arr, int n) {
        for(int idx=arr.length%2==0?1:0; idx<arr.length; idx+=2) {
            arr[idx]+=n;
        }

        return arr;
    }
}
