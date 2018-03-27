// Given a set of words (without duplicates), find all word squares you can build from them.

// A sequence of words forms a valid word square if the kth row and column read the exact same string, where 0 ≤ k < max(numRows, numColumns).

// For example, the word sequence ["ball","area","lead","lady"] forms a word square because each word reads the same both horizontally and vertically.

// b a l l
// a r e a
// l e a d
// l a d y

// Note:
    // There are at least 1 and at most 1000 words.
    // All words will have the exact same length.
    // Word length is at least 1 and at most 5.
    // Each word contains only lowercase English alphabet a-z.

public class WordSquares {
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> ret = new ArrayList<List<String>>();

        if(words.length==0 || words[0].length()==0) {
            return ret;
        }

        Map<String, Set<String>> map = new HashMap<>();

        int squareLen = words[0].length();

        // create all prefix
        for(int i=0;i<words.length;i++){
            for(int j=-1;j<words[0].length();j++){
                if(!map.containsKey(words[i].substring(0, j+1))) {
                    map.put(words[i].substring(0, j+1), new HashSet<String>());
                }

                map.get(words[i].substring(0, j+1)).add(words[i]);
            }
        }

        helper(ret, new ArrayList<String>(), 0, squareLen, map);

        return ret;
    }

    public void helper(List<List<String>> ret, List<String> cur, int matched, int total, Map<String, Set<String>> map){
        if(matched == total) {
            ret.add(new ArrayList<String>(cur));
            return;
        }

        // build search string
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<=matched-1;i++) {
            sb.append(cur.get(i).charAt(matched));
        }

        // bachtracking
        Set<String> cand = map.get(sb.toString());

        if(cand==null) {
            return;
        }

        for(String str:cand){
            cur.add(str);
            helper(ret, cur, matched+1, total, map);
            cur.remove(cur.size()-1);
        }
    }
}
