import java.util.ArrayList;
import java.util.List;

class Interval {
    int start;
    int end;
    
    Interval() { start = 0; end = 0; }
    
    Interval(int s, int e) { start = s; end = e; }
}

public class solution11 {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();
        
        for (Interval interval : intervals) {
            if (interval.end < newInterval.start) {
                result.add(interval);
            } else if (interval.start > newInterval.end) {
                result.add(newInterval);
                newInterval = interval;
            } else { // intervals overlap
                newInterval.start = Math.min(interval.start, newInterval.start);
                newInterval.end = Math.max(interval.end, newInterval.end);
            }
        }
        
        result.add(newInterval); // add the last merged interval
        return result;
    }

    public static void main(String[] args) {
        solution11 sol = new solution11();
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));

        Interval newInterval = new Interval(2, 5);

        List<Interval> result = sol.insert(intervals, newInterval);
        
        for (Interval interval : result) {
            System.out.println("[" + interval.start + "," + interval.end + "]");
        }
    }
}
