package Collection;
import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		LinkedList a = new LinkedList();
		a.add("Neha");
		a.add("Aarati");
		a.add("Bhavisha");
		a.add("Renu");
		
		ListIterator lt = a.listIterator();
		
		while(lt.hasNext()) {
			String I = (String)lt.next();
			System.out.println(I);
			//System.out.println(I.nextIndex());
//			if(I.equals("Neha")){
//				lt.add("Amitha");
//			}
			if(I.equals("Neha")) {
				lt.nextIndex();
			}}
		while(lt.hasPrevious()) {
			String I1 = (String)lt.previous();
			System.out.println(I1);
		
		
	}

	}}
