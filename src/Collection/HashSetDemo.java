package Collection;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		//HashSet h1= new hashSet();   insertion order not preseve print according to hash code
		LinkedHashSet h = new LinkedHashSet();  // insertion order preserved
		
		h.add("a");
		h.add("B");
		h.add("Z");
		h.add(2);
		h.add(4);
		h.add("Neha");
		h.add(null);
		
		System.out.println(h.add(2));
		System.out.println(h);
		

	}

}
