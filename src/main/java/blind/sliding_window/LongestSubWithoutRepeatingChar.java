package blind.sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubWithoutRepeatingChar {
    static public int lengthOfLongestSubstring(String s) {
        /*
        * Solution 1:
        * Create a list of char.
        * Add current char to the list if it is not there.
        * If it already there and the list has more than 1 char,
        * create a sublist start from the index of duplicate char till len of the list
        *
        * If the list has less than or equal 1, remove the duplicated char from the list and add the current
        * this to avoid subsequence char that are similar
        * */

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

        /*
         * Solution 2:
         * Create a hash set of char.
         * initiate 2 pointers at 0, 0
         * While loop if pointer 1 still less than len of input string
         *
         * Add current char to the map if not there. Maintain a max value to compare
         *
         * If it already there, remove the char from pointer 2 and increase the pointer
         * this will be repeated until there is none duplicated char
         *
        public int lengthOfLongestSubstring(String s) {
        int ptr1 = 0;
        int ptr2 = 0;
        int maxS = 0;
        HashSet<Character> hash = new HashSet();
        while (ptr1 < s.length()){
            if(!hash.contains(s.charAt(ptr1))){
                hash.add(s.charAt(ptr1));
                ptr1 += 1;
                maxS = Math.max(maxS, hash.size());
            }
            else{
                hash.remove(s.charAt(ptr2));
                ptr2++;
            }
        }
        return maxS;
    }
         * */
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aabaab!bb"));
    }
}
