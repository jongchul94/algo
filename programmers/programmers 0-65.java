import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<String>();
        String temp = "";
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i) == ' '){
                if(!temp.isEmpty()){
                    list.add(temp);
                }
                temp = "";
            }else if(i==my_string.length()-1){
                temp += my_string.charAt(i);
                list.add(temp);
                break;
            }else{
                temp += my_string.charAt(i);
            }
        }
        return list.toArray(new String[0]);
    }
}


class Solution {
    public String[] solution(String my_string) {
        return myString.trim().split("\\s+");
    }
}