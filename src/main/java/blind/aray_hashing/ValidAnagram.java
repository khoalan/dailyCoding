package blind.aray_hashing;

//https://leetcode.com/problems/valid-anagram/

import java.util.HashMap;

public class ValidAnagram {
    static boolean sol(String s, String t){
        boolean flag = true;
        HashMap<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i<s.length(); i++){
            myMap.put(s.charAt(i), myMap.getOrDefault(s.charAt(i),0)+1);
        }
//        System.out.println("S:"+myMap);
        for (int i = 0; i<t.length(); i++) {
            myMap.put(t.charAt(i), myMap.getOrDefault(t.charAt(i),0) - 1);
        }
//        System.out.println("T:"+myMap);
        for (Character c:myMap.keySet()){
            if (myMap.get(c) != 0){
                flag = false;
//                System.out.println(flag);
                return false;
            }
        }
//        System.out.println(flag);
        return true;
    }

    public static void main(String[] args) {
        sol("rat", "eat");
        sol("tea", "eat");
    }

}
