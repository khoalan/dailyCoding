package blind.greedy;

public class JumpGame {
    public static boolean ans=false;
    public static boolean canJump(int[] nums) {
        int reach=0;

        for(int i=0;i<=reach;i++){
            reach=Math.max(reach,i+nums[i]);

            // if reach value equal to last index or greater so it means it is possible to reach last index so return true
            if(reach>=nums.length-1){
                return true;
            }
        }
        // return false
        return false;
    }
    public static void dfs(int curr, int[] nums, int i){
        if (curr == nums.length-1) {
            ans = true;
            return;
        }
        dfs(nums[i]+i, nums, nums[i]+i);

        dfs(nums[i]-1+i, nums, nums[i]-1+i);

        return;
    }
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{1,1,0,2,4}));
    }
}
