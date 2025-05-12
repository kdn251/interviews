public class OneEditDistanceRefactor {
    public static boolean isOneEditDistance(String s, String t) {
        int m = s.length();
        int n = t.length();

        // If the length difference is greater than 1, can not have one edit
        if (Math.abs(m - n) > 1) {
            return false;
        }

        // Make sure string s is always shorter than or equal to string t
        if (m > n) {
            return isOneEditDistance(t, s);
        }

        for (int i = 0; i < m; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                if (m == n) {
                    return s.substring(i + 1).equals(t.substring(i + 1));
                }
                return s.substring(i).equals(t.substring(i + 1));
            }
        }
        return (n - m) == 1;
    }
}
