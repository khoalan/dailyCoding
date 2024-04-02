package blind.bit;

//https://leetcode.com/problems/single-number/

public class SingleNumber {
    static int singleNumber(int[] nums) {
        int res=0;
        for(int i : nums){
            res^=i;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
