//Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
//
//Find all the elements of [1, n] inclusive that do not appear in this array.
//
//Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
//
//Example:
//
//Input:
//[4,3,2,7,8,2,3,1]
//
//Output:
//[5,6]

class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         List<Integer> result = new ArrayList<>();
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] < i + 1) {
                result.add(i + 1);
            } else if (ary[i] > i + 1 && ary[ary[i] - 1]!=ary[i]) {
                int temp = ary[ary[i] - 1];
                ary[ary[i] - 1] = ary[i];
                ary[i] = temp;
                i--;
            } else if (ary[i]!=i+1) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
