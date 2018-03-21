/* write a method to return all subsets of a set */

public class AllSubsets {
	 ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index) {
		ArrayList<ArrayList<Integer>> allsubsets;
		if(set.size() == index) { //base case - add empty set
			allsubsets = new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>()); //empty set
		}
		else {
			allsubsets = getSubsets(set, index + 1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
			allsubsets.stream().map(subset -> {
				ArrayList<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset);
				return newsubset;
			}).map(newsubset -> {
				newsubset.add(item);
				return newsubset;
			}).forEach(newsubset -> {
				moresubsets.add(newsubset);
			});
			allsubsets.addAll(moresubsets);
		}
		return allsubsets;
	}
}
