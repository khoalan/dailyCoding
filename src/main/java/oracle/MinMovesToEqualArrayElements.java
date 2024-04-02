package oracle;

//lc 453

public class MinMovesToEqualArrayElements {

    public static int minMoves(int[] nums) {
        int min = nums[0];
        for (int num:nums){
            if (min > num) {
                min = num;
            }
        }

        int ans = 0;
        for (int num:nums){
            ans = ans + (num-min);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minMoves(new int[]{1,2,3}));
    }
}
