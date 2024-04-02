package blind.sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubWithoutRepeatingChar {
    static public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        List<Character> arr = new ArrayList<>();
        for (int i = 0; i<s.length();i++){

            if (!arr.contains(s.charAt(i))){
                arr.add(s.charAt(i));
                ans = Math.max(ans, arr.size());
            } else {
                if (arr.size()>1) {
                    System.out.println("index: "+ arr.indexOf(s.charAt(i)));
                    System.out.println("sub: "+ arr.subList(arr.indexOf(s.charAt(i))+1, arr.size() - 1));
                    arr = arr.subList(arr.indexOf(s.charAt(i))+1, arr.size() - 1);
                    arr.add(s.charAt(i));
                } else {
                    arr.remove(arr.indexOf(s.charAt(i)));
                    arr.add(s.charAt(i));
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aabaab!bb"));
    }
}
