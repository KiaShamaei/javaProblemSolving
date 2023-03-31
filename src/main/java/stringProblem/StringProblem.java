package stringProblem;

import java.util.HashMap;
import java.util.Map;

public class StringProblem {
    public Map<Character , Integer> countCharter1(String s){
        Map<Character,Integer> result = new HashMap<>();
        for (int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            result.compute(c , (k,v)->(v==null) ? 1 : ++v);
        }
        return result;
    }
    public Boolean isPalindrome(String str){
        int left  = 0 ;
        int right = str.length() - 1 ;
        while (right > left){
            if(str.charAt(left) != str.charAt(right)){
                return false ;
            }
            left ++ ;
            right --;
        }
        return true;
    }
    public Boolean isPalindrome2(String str){
        return  str.equals(new StringBuilder(str).reverse().toString());
    }

    public String removeChar(Character cha , String str){
        StringBuilder st = new StringBuilder();
        char[] temp = str.toCharArray();
        for(char ch : temp){
            if(cha != ch){
                st.append(ch);
            }
        }
        return st.toString();
    }
    public String removeDuplicateChar(String str){
        char[] charlist = str.toCharArray();
        StringBuilder temp = new StringBuilder();
        for (char ch : charlist){
            if(temp.indexOf(String.valueOf(ch)) == -1){
                temp.append(ch);
            }
        }
        return temp.toString();
    }
}
