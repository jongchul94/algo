class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int min = -1;
            for(int j=queries[i][0];j<=queries[i][1];j++){
                if((queries[i][2] < arr[j] && min == -1) || (queries[i][2] < arr[j] && min > arr[j])){
                    min = arr[j];
                }
            }
            answer[i] = min;
        }
        return answer;
    }
}