package blind.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(new ArrayList<>(), ans, 0, nums);
        return ans;
    }

    static void helper(ArrayList<Integer> curr, List<List<Integer>> ans, int idx, int[]nums){
        if (idx == nums.length){
            ans.add(curr);
            return;
        }

        ArrayList<Integer> newList = new ArrayList<>(curr);
        newList.add(nums[idx]);
        helper(newList, ans, idx + 1, nums);

        helper(curr, ans, idx + 1, nums);
    }

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }
}
