package blind.two_pointers;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while(left<=right){
            int sum = numbers[left] + numbers[right];
            if (sum < target){
                left++;
            }
            if (sum > target){
                right--;
            }
            if (sum == target){
                ans[0] = left+1;
                ans[1] = right+1;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] input = new int[]{2,7,11,15};
        System.out.println(twoSum(input, 9).toString());
    }

}
