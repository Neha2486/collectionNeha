package Collection;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet t =new TreeSet();
		
//		t.add("A");
//		t.add("B");
//		t.add("G");
//		t.add("a");
//		
//		//System.out.println(t.add(new Integer(10)));
//		System.out.println(t);
		
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("F"));
		t.add(new StringBuffer("R"));
		t.add(new StringBuffer("T"));
		
		System.out.println(t);
		
	}

}
