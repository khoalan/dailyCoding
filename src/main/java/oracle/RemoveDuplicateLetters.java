package oracle;

import org.apache.commons.lang3.mutable.MutableBoolean;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

//lc 316

public class RemoveDuplicateLetters {

    static String removeDuplicateLetters(String s){
//        Solution1:
        String[] temp = s.split("");
        StringBuilder ans = new StringBuilder();
        for (int i=0; i < temp.length;i++){
            if (s.indexOf(temp[i]) == i){
                ans.append(temp[i]);
            }
        }

        System.out.println(ans.toString());
        return ans.toString();

//        Solution2:
//        int[] cnt = new int[26];
//        int pos = 0;
//        for (int i = 0; i < s.length(); i++) cnt[s.charAt(i) - 'a']++;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) < s.charAt(pos)) pos = i;
//            if (--cnt[s.charAt(i) - 'a'] == 0) break;
//        }
        // our answer is the leftmost letter plus the recursive call on the remainder of the string
        // note that we have to get rid of further occurrences of s[pos] to ensure that there are no duplicates
//        return s.length() == 0 ? "" : s.charAt(pos) + removeDuplicateLetters(s.substring(pos + 1).replaceAll("" + s.charAt(pos), ""));

//        Solution3:
//        int[] frequency = new int[26];
//        boolean[] visited = new boolean[26];
//        for (char c:s.toCharArray()){
//            frequency[c-'a']++;
//        }
//        Stack<Character> ans = new Stack<>();
//
//        for (char c:s.toCharArray()){
//            frequency[c-'a']--;
//            if (visited[c-'a']) continue;;
//            while (!ans.isEmpty() && ans.peek() > c && frequency[ans.peek()-'a'] > 0){
//                visited[ans.peek()-'a'] = false;
//                ans.pop();
//            }
//            ans.push(c);
//            visited[c-'a'] = true;
//        }
//
//        return ans.stream().map(c -> c.toString()).collect(Collectors.joining(""));
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicateLetters("helloworld"));

    }
}


// cbacdcbc
// bacdcbc
// 1, 2, 2
// b -> 1,1,2
// c -> 1,1,1
// a -> 0,1,1
// st = [a]
// vst = ,t,f