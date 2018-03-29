//Given two lists Aand B, and B is an anagram of A. B is an anagram of A means B is made by randomizing the order of the elements in A.
//We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element in A appears in B at index j.
//These lists A and B may contain duplicates. If there are multiple answers, output any of them.

//For example, given
//A = [12, 28, 46, 32, 50]
//B = [50, 12, 32, 46, 28]

//We should return
//[1, 4, 3, 2, 0]
//as P[0] = 1 because the 0th element of A appears at B[1], and P[1] = 4 because the 1st element of A appears at B[4], and so on.

class FindAnagramMappings {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] mapping = new int[A.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < B.length; i++) {
            map.put(B[i], i);
        }
        
        for(int i = 0; i < A.length; i++) {
            mapping[i] = map.get(A[i]);
        }
        
        return mapping;
    }
}
