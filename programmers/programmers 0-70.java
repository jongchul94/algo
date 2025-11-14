import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String str = "";
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<String>();
        for(int i=0;i<myStr.length();i++){
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c'){
                str = sb.toString();
                if(!str.isEmpty()){
                    list.add(str);
                }
                sb.setLength(0);
            }else if(i == myStr.length()-1){
                sb.append(myStr.charAt(i));
                str = sb.toString();
                if(!str.isEmpty()){
                    list.add(str);
                }
            }else{
                sb.append(myStr.charAt(i));
            }
        }
        String[] answer = list.toArray(new String[0]);
        if(answer.length == 0){
            answer = new String[]{"EMPTY"};
        }
        return answer;
    }
}


class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a|b|c]+", ",");
        myStr = myStr.charAt(0) == ',' ? myStr.substring(1) : myStr;
        myStr = myStr.equals("") ? "EMPTY" : myStr;

        return myStr.split("[,]");
    }
}