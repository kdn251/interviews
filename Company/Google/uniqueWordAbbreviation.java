// An abbreviation of a word follows the form <first letter><number><last letter>. Below are some examples of word abbreviations:

// a) it                      --> it    (no abbreviation)

//      1
// b) d|o|g                   --> d1g

//               1    1  1
//      1---5----0----5--8
// c) i|nternationalizatio|n  --> i18n

//               1
//      1---5----0
// d) l|ocalizatio|n          --> l10n
// Assume you have a dictionary and given a word, find whether its abbreviation is unique in the dictionary. A word's abbreviation is unique if no other word from the dictionary has the same abbreviation.

// Example: 
// Given dictionary = [ "deer", "door", "cake", "card" ]

// isUnique("dear") -> 
// false

// isUnique("cart") -> 
// true

// isUnique("cane") -> 
// false

// isUnique("make") -> 
// true

import java.util.ArrayList;

public class UniqueWordAbbreviation {
    HashMap<String, String> map;

    public ValidWordAbbr(String[] dictionary) {
        this.map = new HashMap<String, String>();
        
        for(String word : dictionary) {
            String key = getKey(word);
            
            if(map.containsKey(key)) {
                if(!map.get(key).equals(word)) {
                    map.put(key, "");
                }
            } else {
                map.put(key, word);
            }
        }
    }

    public boolean isUnique(String word) {
        return !map.containsKey(getKey(word))||map.get(getKey(word)).equals(word);
    }
    
    public String getKey(String word) {
        if(word.length() <= 2) {
            return word;
        }
        
        return word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
    }
}


// Your ValidWordAbbr object will be instantiated and called as such:
// ValidWordAbbr vwa = new ValidWordAbbr(dictionary);
// vwa.isUnique("Word");
// vwa.isUnique("anotherWord");
