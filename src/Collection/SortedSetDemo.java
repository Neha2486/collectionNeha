package Collection;
import java.util.*;

public class SortedSetDemo {

	public static void main(String[] args) {
		
		SortedSet st = new TreeSet();
		
//		st.add("a");
//		st.add("a");
//		st.add("d");
//		st.add("c");
//		st.add("af");
//		
//		
//		System.out.println(st);
//		System.out.println(st.first());
//		
		
		st.add(103);
		st.add(122);
		st.add(100);
		st.add(201);
		System.out.println(st.headSet(201));
		System.out.println(st.tailSet(103));
		System.out.println(st.subSet(103,201));
		System.out.println(st.comparator());

	}

}
