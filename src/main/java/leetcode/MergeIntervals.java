package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> merged = new ArrayList<>();
        int head = intervals[0][0];
        int tail = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (tail >= start) {
                tail = end;
            }else{
                int[] connectedInterval = new int[2];

                connectedInterval[0] =  head;
                connectedInterval[1] =  tail;
                merged.add(connectedInterval);
                head = start;
                tail = end;
            }
        }

        int[] connectedInterval = new int[2];
        connectedInterval[0] =  head;
        connectedInterval[1] =  tail;
        merged.add(connectedInterval);

        int[][] result = merged.toArray(new int[merged.size()][]);

        return result;
    }
}
