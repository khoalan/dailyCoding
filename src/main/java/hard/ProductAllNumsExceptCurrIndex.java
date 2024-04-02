/*
2. Given an array of integers, return a new array such that
each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5],
the expected output would be [120, 60, 40, 30, 24].
If our input was [3, 2, 1], the expected output would be [2, 3, 6].
    [1, 2, 3, 4, 5]
    temp=1
    for (i = 0; i < n; i++) {
            prod[i] = temp; // [1,1,2,6,24]
            temp *= arr[i]; 1,2,6,24.
        }
    temp=1
    for (i = n - 1; i >= 0; i--) {
        prod[i] *= temp; //[1,1,2,6,24]
        temp *= arr[i];
    }
*/

package hard;
import java.util.*;

public class ProductAllNumsExceptCurrIndex {
    static void sol(int[] arrNum){
        int n = arrNum.length;
        int ans[] = new int[arrNum.length];

        ans[0] = 1; //[1,,,,]

        //Calculate left product
        for (int i=1; i<arrNum.length; i++){ //[1, 2, 3, 4, 5]
            ans[i] = ans[i-1]*arrNum[i-1]; // ans [1, 1, 2, 6, 24]
        }

        //Calculate right product
        int temp=1;
        for (int i=n-1; i>=0; i--){
            ans[i] = ans[i]*temp; // ans [24], [30,24], [40,30,24], [60, 40, 30, 24], [120, 60, 40, 30, 24]
            temp = temp*arrNum[i]; // 5, 20, 60, 120
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[] myList = new int[]{1, 2, 3, 4, 5}; //{-1,1,0,-3,3}-> [0, 0, 9, 0, 0]
        sol(myList);
    }
}
