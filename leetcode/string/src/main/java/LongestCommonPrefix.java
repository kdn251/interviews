class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        
        String s = strs[0];
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(i >= strs[j].length() || strs[j].charAt(i) != current) {
                    return s.substring(0, i);
                }
            }
        }
        
        return s;
    }
}
