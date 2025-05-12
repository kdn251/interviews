//Given a collection of distinct numbers, return all possible permutations.
//
//For example,
//[1,2,3] have the following permutations:
//[
  //[1,2,3],
  //[1,3,2],
  //[2,1,3],
  //[2,3,1],
  //[3,1,2],
  //[3,2,1]
//]

class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        for (int n: nums) {
            int size = result.size();
            while(size > 0) {
                List<Integer> current = result.pollFirst();
                for (int i = 0; i <= current.size(); i++) {
                    List<Integer> temp = new ArrayList<Integer>(current);
                    temp.add(i, n);
                    result.add(temp);
                }
                size--;
            }
        }

        return result;
    }
}
