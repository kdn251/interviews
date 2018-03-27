// Assume you have a method isSubstring which checks if one word is a isSubstring of another.
// Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only
// one call to isSubstring(e.g., "waterbottle" is a rotation of "erbottlewat").

public class IsRotation {
	public boolean isRotation(String s1, String s2) {
		int len = s1.length();
		/*check that s1 and s2 are equal length and not empty */
		if(len == s2.length() && len > 0) {
			/* concatenate s1 and s1 within new buffer */
			String s1s1 = s1 + s1;
			return isSubstring(s1s1, s2);
		}

		return false;
	}
}