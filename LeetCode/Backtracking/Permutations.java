/*

 Given a collection of distinct numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:

[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]

*/

class Solution {
    public boolean[] used;
    public int len;
    public List<List<Integer>> sols;
    public int[] sol;
    public int[] numbers;
    public List<List<Integer>> permute(int[] nums) {
        len = nums.length;
        numbers = nums;
        sols = new ArrayList<>();
        sol = new int[len];
        used = new boolean[nums.length];
        Arrays.sort(nums, 0, len);
        permute(0);
        return sols;
    }
    public void permute(int index){
        if(index == len){
            List<Integer> currSol = new ArrayList<>();
            for(int i=0; i<len; i++) currSol.add(sol[i]);
            sols.add(currSol);
            return;
        }
        for(int i=0; i<len; i++){
            if(used[i]) continue;
            used[i] = true;
            sol[index] = numbers[i];
            permute(index + 1);
            used[i] = false;
        }
    }
}
