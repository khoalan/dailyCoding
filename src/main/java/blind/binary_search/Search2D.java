package blind.binary_search;

import java.util.Arrays;

public class Search2D {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] mat = new int[row*col];
        for (int i=0;i<mat.length;i++){
            mat[i] = matrix[i/col][i%col];
        }
        System.out.println(Arrays.toString(mat));

        int left = 0;
        int right = row*col-1;
        while(left<=right){
            int mid = (left+right)/2;
            if (matrix[mid/col][mid%col] == target){
                return true;
            } else if (matrix[mid/col][mid%col] > target){
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 3));
    }
}
