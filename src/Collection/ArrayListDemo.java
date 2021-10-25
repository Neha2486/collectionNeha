package Collection;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(97);
		a.add("java");
		a.add('a');
		a.add(null);
		System.out.println(a);
		a.set(2, 94);
		System.out.println(a.get(3));
		a.remove(0);
		System.out.println(a.clone());
		System.out.println(a.isEmpty());
		System.out.println(a.lastIndexOf(null));
		a.add(2,null);
		System.out.println(a);
		System.out.println(a.size());
		a.trimToSize();
		System.out.println(a.size());
		//a.forEach("p");
		System.out.println(a);
		

	}

}
