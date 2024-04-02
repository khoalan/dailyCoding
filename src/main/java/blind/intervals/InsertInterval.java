package blind.intervals;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    static public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int[] temp = newInterval;
        for(int i=0; i<intervals.length;i++){
            if (intervals[i][0] > temp[1]){
                ans.add(temp);
                temp = intervals[i];
            } else if (intervals[i][1] < temp[0]){
                ans.add(intervals[i]);
            } else {
                temp[0] = Math.min(temp[0], intervals[i][0]);
                temp[1] = Math.max(temp[1], intervals[i][1]);
            }
        }
        ans.add(temp);
        int[][] interval = new int[ans.size()][2];
        return ans.toArray(interval);
    }

    public static void main(String[] args) {

    }
}
