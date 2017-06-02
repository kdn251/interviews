//Different examples of implementations of arrays and strings to determine permutations. 

public class Permutation {
	/**
	*boolean method to compare two Strings and determine whether they are permutations of each other.
	*@param two Strings
	\\returns true if these two Strings are Permutations
		  false if not */
			  
	public boolean areStringPermutations(String s, String t) {
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
	
	/**
	*boolean method to compare two int arrays and determine whether they are permutations of each other.
	@param two int arrays 
	*Assume there are no duplicates
	*/
	public static boolean areIntArrayPermutations1(int[] a1, int[] a2){
       		if(a1.length != a2.length)
			return false;
		
		for(int i = 0; i < a1.length; i++){
        		int count = 0;
        	for(int j = 0; j < a2.length; j++){
                	if(a1[i] == a2[j])
               		count = 1;
            	}
            	if(count != 1)
           	return false;
        }
        	return true;
    }
	
	
	/**
	*boolean method to compare two int arrays and determine whether they are permutations of each other.
	@param two int arrays 
	*When there are duplicates
	*/
	public static boolean areIntArrayPermutations2(int[] a1, int[] a2){
		if(a1.length != a2.length)
			return false;
		
        	ArrayList<Integer> secondArray = new ArrayList<Integer>();
       		for(int integerValue: a2){
            	secondArray.add(integerValue);
        	}
        
        	for(int i = 0; i < a1.length ; i++){
             	for(int j = 0; j < secondArray.size(); j++){
                	if(a1[i] == secondArray.get(j).intValue())
                	secondArray.remove(j);
             		}                
        	}
       		return secondArray.size() == 0; 
        }   
}
	




