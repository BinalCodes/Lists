import java.util.ArrayList;
import java.util.Arrays;

// Print all the subsets of a distict array given e.g. {1,2,3} o/p -> {},{1},{2},{3},{1,2},{1,2,3},{2,3},{1,3}
public class PowerSet {

	public static void main(String[] args) {
		ArrayList<Integer> set = new ArrayList<Integer> (Arrays.asList(1,2,3));
		ArrayList<ArrayList<Integer>> result = printAllSubsets(set);
		for (ArrayList subSet : result) {
			System.out.println("subsets are "+subSet.toString());
		}

	}
	public static ArrayList<ArrayList<Integer>> printAllSubsets (ArrayList<Integer> set) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		for (int i= 0;i < set.size() ; i++) {
			int item = set.get(i);
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
			
			for (ArrayList<Integer> a : result) {
				temp.add(new ArrayList<Integer>(a));
			}
			
			//add that element in temp arraylist
			for (ArrayList<Integer> b : temp) {
				b.add(item);	
			}
			
			// add that single element to a new list individually
			ArrayList<Integer> singleList = new ArrayList<Integer>();
			singleList.add(item);
			temp.add(singleList);
			
			result.addAll(temp);
		}
		result.add(new ArrayList<Integer>());
		return result;
	}
}
