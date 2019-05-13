import java.util.ArrayList;

public class SubSortThenMerge_Sorter extends Sorter {
	
	
	public SubSortThenMerge_Sorter( ArrayList<String> data) {
        super(data);
    }
	
	public void mySort() {
		elements = mySort(0, elements.size() - 1);
	}
	
	public ArrayList<String> mySort(int start, int end) {
		if (end - start < 1) { // decision, base case solution
			ArrayList<String> single = new ArrayList<String>();
			single.add(elements.get(start));
			return single;
		}
		else { // recursive case solution
			int middle = (end + start) / 2;
			ArrayList<String> newList = mySort(start, middle); // recursive abstraction
			newList.addAll(mySort(middle, end));               //
			Merger merger = new Merger(newList);
			merger.merge(start, middle, end); // combining operator
			return merger.usersData;
		}
	}
	
	public String toString() {
        String result = "[";
        for( String e : elements)
            result += e + ",";
        return result + "]";
    }
	
	/** 
      @return the boolean value of the statement
         "the elements are in ascending order"
     */
    public boolean isSorted() {
        for( int i = 0
           ; i < elements.size() -1 // stop early, because comparing to next
           ; i++
           )
            if( elements.get(i).compareTo( elements.get(i+1)) > 0) return false;
        return true;
    }
}