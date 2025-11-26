import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<rank.length;i++){
            if(attendance[i]){
                list.add(rank[i]);
            }
        }
        Collections.sort(list);
        for(int j=0;j<rank.length;j++){
            if(list.get(0) == rank[j]){
                answer += 10000*j;
            }else if(list.get(1) == rank[j]){
                answer += 100*j;
            }else if(list.get(2) == rank[j]){
                answer += j;
            }
        }
        
        return answer;
    }
}


class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int ans = 0, cnt = 0, r = 1;
        int[] abc = new int[3];
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0 ; i<rank.length ; i++){
            m.put(rank[i],i);
        }
        while(cnt<3){
            if(attendance[m.get(r)])
                abc[cnt++] = m.get(r);
            r++;
        }
        return abc[0]*10000 + abc[1]*100 + abc[2];
    }
}
