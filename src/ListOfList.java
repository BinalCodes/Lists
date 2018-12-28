import java.util.*;

public class ListOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void printListOfList(List<List<Integer>> myList) {
		//for(int)
		for(List<Integer> list : myList) {
			list.get(0);
			//list
		}
	}
	public static List<List<Integer>> getList(){
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		List in = new ArrayList<Integer>();
		in.add(Arrays.asList(1,-2));
		l.add(in);
		in.add(Arrays.asList(-3,-1));
		l.add(in);
		in.add(Arrays.asList(4,5));
		l.add(in);
		return l;
	}
	

}
