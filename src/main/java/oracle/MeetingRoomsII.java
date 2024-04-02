package oracle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

//253
public class MeetingRoomsII {
    public static int minMeetingRooms(int[][] intervals) {
        int ans=1;

        Arrays.sort(intervals, Comparator.comparingInt(num -> num[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        for (int[] interval : intervals) {
            if (!pq.isEmpty() && pq.peek()[1] <= interval[0]) {
                pq.poll();
            }
            pq.add(interval);
        }
        return pq.size();

    }

    public static void main(String[] args) {
//        System.out.println(minMeetingRooms(new int[][]{{0,30},{15,20},{5,10}}));
//        System.out.println(minMeetingRooms(new int[][]{{5,8},{6,8}}));
//        System.out.println(minMeetingRooms(new int[][]{{7,10},{2,4}}));
//        System.out.println(minMeetingRooms(new int[][]{{9,10},{4,9},{4,17}}));
//        System.out.println(minMeetingRooms(new int[][]{{1,5},{8,9},{8,9}}));
//        System.out.println(minMeetingRooms(new int[][]{{8,17},{5,15},{6,20}}));
        int[] myL =  new int[]{6,20,10,21};
        int[] ans = Arrays.stream(myL).map(num -> num%2).toArray();
        System.out.println(Arrays.toString(ans));
    }
}
