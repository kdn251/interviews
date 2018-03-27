// Given two strings, write a method to decide if one is a permutation of the other

public class Permutation {
	public boolean permutation(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}

		int[] letters = new int[256];

		char[] s_array = s.toCharArray();
		for(char c : s_array) {
			letters[c]++;
		}

		for(int i = 0; i < t.length(); i++) {
			int c = (int)t.charAt(i);
			if(--letters[c] < 0) {
				return false;
			}
		}

		return true;
	}
}
