// Given two 1d vectors, implement an iterator to return their elements alternately.

// For example, given two 1d vectors:

// v1 = [1, 2]
// v2 = [3, 4, 5, 6]
// By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1, 3, 2, 4, 5, 6].

// Follow up: What if you are given k 1d vectors? How well can your code be extended to such cases?

/**
 * Your ZigzagIterator object will be instantiated and called as such: 
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */

public class ZigZagIterator {
    private Iterator<Integer> i;
    private Iterator<Integer> j;
    private Iterator<Integer> temp;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        i = v1.iterator();
        j = v2.iterator();
    }

    public int next() {
        if(i.hasNext()) {
            temp = i;
            i = j;
            j = temp;
        }
        
        return j.next();
    }

    public boolean hasNext() {
        return i.hasNext() || j.hasNext();
    }
}
