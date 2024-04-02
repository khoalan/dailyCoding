package blind.backtracking;

//https://leetcode.com/problems/combination-sum/

import java.util.*;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        int temp = target;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(0, ans, curr, candidates, target);
        return ans;
    }

    public static void helper(int i, List<List<Integer>> ans, List<Integer> curr, int[] nums, int temp){
        if (temp == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (i >= nums.length || temp < 0) return;

        curr.add(nums[i]);
        helper(i, ans, curr, nums,temp-nums[i]);
        curr.remove(curr.get(curr.size()-1));
        helper(i+1, ans, curr, nums, temp);
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,5}, 8));
    }
}
