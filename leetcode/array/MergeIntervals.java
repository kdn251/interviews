// Given a collection of intervals, merge all overlapping intervals.

// For example,
// Given [1,3],[2,6],[8,10],[15,18],
// return [1,6],[8,10],[15,18].

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if(intervals == null || intervals.size() == 0) {
            return result;
        }
        
        Interval[] allIntervals = intervals.toArray(new Interval[intervals.size()]);
        Arrays.sort(allIntervals, new Comparator<Interval>() {
           public int compare(Interval a, Interval b) {
               if(a.start == b.start) {
                   return a.end - b.end;
               }
               return a.start - b.start;
           } 
        });
        
        for(Interval i: allIntervals) {
            if (result.size() == 0 || result.get(result.size() - 1).end < i.start) {
                    result.add(i);
            } else {
                result.get(result.size() - 1).end = Math.max(result.get(result.size() - 1).end, i.end);
            }
        }
        
        return result;
    }
}
