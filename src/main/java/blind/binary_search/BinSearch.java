package blind.binary_search;

//https://leetcode.com/problems/binary-search/

public class BinSearch {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right)/2;
            if (nums[mid] > target){
                right = mid-1;
            } else if (nums[mid] < target){
                left= mid+1;
            } else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[] {-1,0,3,5,9,12}, 9));
    }
}
