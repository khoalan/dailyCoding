package blind.two_pointers;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.toString().equals(sb.reverse().toString()))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abaa"));
        System.out.println(isPalindrome("aba"));
    }
}
