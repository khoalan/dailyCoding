package blind.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        for (int i=1; i < intervals.length; i++){
            int[] temp = ans.get(ans.size()-1);
            if (intervals[i][0] <= temp[1]){
                temp[1] = Math.max(intervals[i][1], temp[1]);
            } else {

                ans.add(intervals[i]);
            }
        }
        return ans.toArray(new int[ans.size()][2]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(new int[][]{{1,3},{2,6},{8,10},{15,18}})));
    }
}
