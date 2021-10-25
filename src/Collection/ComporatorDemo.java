package Collection;
import java.util.*;

//Write a program to insert integer objects into the TreeSet where the sorting
//order is descending order.
public class ComporatorDemo {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(8);
		t.add(13);
		t.add(45);
		
		System.out.println(t);
	}
}

class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2 ) {
		
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		if(i1<i2) 
			return +1;
		
		else if(i1>i2)
			return -1;
		
		else 
			return 0;
	//	return i1.compareTo(i2);
		//return -i1.compareTo(i2);
		//return i2.compareTo(i1);
	//return -i2.compareTo(i1);
//		return -1;
//		return +1;
//		
		}
	}
