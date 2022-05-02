package code.practice;

import java.util.*;

public class checkIfcontainsrepeatingchar {
    public static void main(String[] args) {
        String str="abcda";
        System.out.println(checkWithList(str));
    }
    public static boolean checkWithHashMap(String str){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0; i< str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        Set<Character> key = map.keySet();
        for(char ch:key){
            if(map.get(ch)>1){
                return true;
            }
        }
        return  false;
    }
    public static boolean checkWithHashSet(String str){
        Set<Character> set = new HashSet<Character>();
        for(int i=0; i< str.length(); i++){
            if(set.contains(str.charAt(i))){
                return true;
            }else{
                set.add(str.charAt(i));
            }
        }
        return false;
    }

    public static boolean checkWithList(String str){
        List<Character> list = new ArrayList<Character>();
        for(int i=0; i< str.length(); i++){
            if(list.contains(str.charAt(i))){
                return true;
            }else{
                list.add(str.charAt(i));
            }
        }
        return false;
    }
}
