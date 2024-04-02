/*
1. Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
*/

package easy;

import java.util.*;

public class SumTwoNumsK {
    static Boolean sol(List<Integer> arr, int k){
        HashSet<Integer> mySet = new HashSet<>();
        for (int i:arr){
            if (mySet.contains(i)) return true;
            mySet.add(k - i);
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 3, 2, 10);
        System.out.println(sol(myList, 20));
    }
}
