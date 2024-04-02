package blind.greedy;

//https://leetcode.com/problems/maximum-subarray/

public class MaximumSubArray {
    static public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int n:nums){
            sum += n;
            max = Math.max(max, sum);
            if(sum<0) sum=0;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5}));
        System.out.println(maxSubArray(new int[]{-2,-3,  -5}));
    }
}
