import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class solution10 {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) return intervals;

        // Sort intervals by start time
        intervals.sort(Comparator.comparingInt(i -> i.start));

        List<Interval> result = new ArrayList<>();
        Interval current = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval next = intervals.get(i);
            if (current.end >= next.start) { // Overlapping intervals, merge them
                current.end = Math.max(current.end, next.end);
            } else { // No overlap, add the current interval to the result
                result.add(current);
                current = next;
            }
        }

        // Add the last interval
        result.add(current);

        return result;
    }

    public static void main(String[] args) {
        solution10 mi = new solution10();
        List<Interval> intervals = Arrays.asList(
            new Interval(1, 3),
            new Interval(2, 6),
            new Interval(8, 10),
            new Interval(15, 18)
        );

        List<Interval> mergedIntervals = mi.merge(intervals);
        for (Interval interval : mergedIntervals) {
            System.out.println("[" + interval.start + "," + interval.end + "]");
        }
    }
}
