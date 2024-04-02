package blind.heap_priorityqueue;

//https://leetcode.com/problems/kth-largest-element-in-a-stream/submissions/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
class CustomIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 > o2 ? 1 : -1;
    }
}
public class KthLargest {
    int key;
    PriorityQueue<Integer> pQ = new PriorityQueue<>(new CustomIntegerComparator());
    public KthLargest(int k, int[] nums) {
        this.key = k;
        for (int num:nums){
            this.pQ.add(num);
        }
        System.out.println("Init="+pQ);
        for (int i = 0; i<nums.length - key; i++){
            pQ.poll();
        }
    }

    public int add(int val) {

        this.pQ.add(val);
        System.out.println(pQ);
        if(pQ.size() > key){
            pQ.poll();
        }

        return pQ.peek();
    }

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(3, new int[] {4,5,8,2});
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }
}
