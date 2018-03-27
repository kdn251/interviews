// Given a string, we can "shift" each of its letter to its successive letter, for example: "abc" -> "bcd". We can keep "shifting" which forms the sequence:

// "abc" -> "bcd" -> ... -> "xyz"
// Given a list of strings which contains only lowercase alphabets, group all strings that belong to the same shifting sequence.

// For example, given: ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"], 
// A solution is:

// [
//   ["abc","bcd","xyz"],
//   ["az","ba"],
//   ["acef"],
//   ["a","z"]
// ]

public class GroupShiftedStrings {
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> result = new ArrayList<List<String>>();
        
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        
        for(String s : strings) {
            int offset = s.charAt(0) - 'a';
            String key = "";
            
            for(int i = 0; i < s.length(); i++) {
                char current = (char)(s.charAt(i) - offset);
                
                if(current < 'a') {
                    current += 26;
                }
                
                key += current;
            }
            
            if(!map.containsKey(key)) {
                List<String> list = new ArrayList<String>();
                map.put(key, list);
            }
            
            map.get(key).add(s);
        }
        
        for(String key : map.keySet()) {
            List<String> list = map.get(key);
            
            Collections.sort(list);
            
            result.add(list);   
        }
        
        return result;
    }
}
