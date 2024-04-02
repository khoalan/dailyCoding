package blind.aray_hashing;

//https://leetcode.com/problems/group-anagrams/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    //Too slow
    static List<List<String>> sol(String[] s){
        List<List<String>> ans = new ArrayList<>();
        List<String> g1 = new ArrayList<>();
        g1.add(s[0]);
        ans.add(g1);
        for (int i=1; i<s.length; i++){
            int flag = 0;
            for (int j=0; j < ans.size(); j++){
                if (ValidAnagram.sol(s[i], ans.get(j).get(0))){
                    ans.get(j).add(s[i]);
                    flag = 1;
                }
            }
            List<String> temp = new ArrayList<>();
            temp.add(s[i]);
            if (flag == 0) ans.add(temp);
        }
        return ans;
    }

    static List<List<String>> sol2(String[] s){
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> myMap = new HashMap<>();
        for (String str:s){
            char[] ch = new char[26];
            for (char c:str.toCharArray()){
                ch[c-'a']++;
            }

            String stringKey = new String(ch);
            myMap.computeIfAbsent(stringKey, v -> new ArrayList<>());
            myMap.get(stringKey).add(str);
            System.out.println(myMap);
        }
        ans.addAll(myMap.values());
        return ans;
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"eat","nat","bat","tea","tan","ate"};
        List<List<String>> ans = sol2(strs);
        System.out.println(ans);
    }
}
