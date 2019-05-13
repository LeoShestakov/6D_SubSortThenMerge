import java.util.ArrayList;

public class UserOfSubSortThenMerge {
	public static void main(String[] commandLine) {
		ArrayList<String> elements = new ArrayList<String>();
		elements.add("C");
		elements.add("A");
		elements.add("D");
		elements.add("B");
		SubSortThenMerge_Sorter sorter = new SubSortThenMerge_Sorter(elements);
		
		sorter.mySort();
		System.out.println(sorter.elements);
	}
}