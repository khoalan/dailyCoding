package blind.aray_hashing;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 6};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> mySet = new HashSet<>();

        for (int num:nums){
            if(!mySet.contains(num)){
                mySet.add(num);
            }
            else return true;
        }

        return false;
    }
}

